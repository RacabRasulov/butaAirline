package com.example.butaairline.dto;

import lombok.Data;

import java.util.ArrayList;
@Data
public class FlightsOfArrival {
    public String flightDate;
    public String fare;
    public String currency;
    public ArrayList<FlightInfoDetailList> flightInfoDetailList;


}
