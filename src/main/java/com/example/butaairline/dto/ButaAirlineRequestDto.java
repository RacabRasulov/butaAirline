package com.example.butaairline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data

public class ButaAirlineRequestDto {

    public Integer adultCount;
    public String arrivalDate;
    public String arrivalPort;
    public Integer childCount;
    public String classType;
    public String click_id;
    public String departureDate;
    public String departurePort;
    public String directionType;
    public Integer infantCount;
    public Boolean isQIWI;
    public String lang;
    public String searchType;

    public ButaAirlineRequestDto() {

    }


    public ButaAirlineRequestDto(Integer adultCount, String arrivalDate, String arrivalPort, Integer childCount, String classType, String clickId, String  departureDate, String departurePort, String directionType, Integer infantCount, Boolean isQIWI, String lang, String searchType) {
        this.adultCount = adultCount;
        this.arrivalDate = arrivalDate;
        this.arrivalPort = arrivalPort;
        this.childCount = childCount;
        this.classType = classType;
        this.click_id = clickId;
        this.departureDate = departureDate;
        this.departurePort = departurePort;
        this.directionType = directionType;
        this.infantCount = infantCount;
        this.isQIWI = isQIWI;
        this.lang = lang;
        this.searchType = searchType;
 }


}
