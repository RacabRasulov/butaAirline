package com.example.butaairline.repository;

import com.example.butaairline.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {


    UserEntity findUsersEntityByEmail(String email);
}
