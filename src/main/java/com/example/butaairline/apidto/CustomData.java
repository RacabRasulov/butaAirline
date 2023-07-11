package com.example.butaairline.apidto;

import java.util.ArrayList;
@lombok.Data

public class CustomData {
    public ArrayList<FlightsOfDeparture> flightsOfDeparture;
    public ArrayList<FlightsOfArrival> flightsOfArrival;
    public ArrayList<String> departureCityName;
    public ArrayList<String> arrivalCityName;
    public String uuid;


}
