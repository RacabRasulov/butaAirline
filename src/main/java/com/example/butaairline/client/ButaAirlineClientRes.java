package com.example.butaairline.client;

import com.example.butaairline.apidto.ButaAirlineRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "fly", url = "https://search.azal.travel/buta/searchFlight")

public interface ButaAirlineClientRes {

        @PostMapping
        ButaAirlineResponseDto get(ButaAirlineRequestDto butaAirlineRequestDto);

}
