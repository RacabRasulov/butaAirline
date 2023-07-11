package com.example.butaairline.controller;


import com.example.butaairline.dto.SignUpDto;
import com.example.butaairline.entity.UserEntity;
import com.example.butaairline.repository.UserRepo;
import com.example.butaairline.securityconfig.ButaTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ButaTokenUtil jwtTokenUtil;

    private final UserDetailsService jwtInMemoryUserDetailsService;

    private final PasswordEncoder passwordEncoder;

    private final UserRepo userRepo;



    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public ResponseEntity<?> signUp (@RequestBody SignUpDto dto){

        UserEntity entity = userRepo.findUsersEntityByEmail(dto.getEmail());
        if (entity == null) {
            UserEntity userEntity = UserEntity.builder()
                    .email(dto.getEmail())
                    .password(passwordEncoder.encode(dto.getPassword()))
                    .role(dto.getRole())
                    .build();
            userRepo.save(userEntity);
            return ResponseEntity.ok("You signed!");
        }else
            return ResponseEntity.ok("This account already exist in our DB!");

    }



    private void authenticate(String username, String password) throws Exception {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }



}
