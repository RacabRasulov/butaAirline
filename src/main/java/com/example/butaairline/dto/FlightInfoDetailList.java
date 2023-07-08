package com.example.butaairline.dto;

import lombok.Data;

import java.util.ArrayList;
@Data
public class FlightInfoDetailList {
    public String rph;
    public int dayOfWeekDeparture;
    public int dayOfWeekArrival;
    public String departureTime;
    public String departureDate;
    public String arrivalTime;
    public String arrivalDate;
    public String departureTimeUTC;
    public String departureDateUTC;
    public String arrivalTimeUTC;
    public String arrivalDateUTC;
    public String departureTimeOffset;
    public String departureStation;
    public ArrayList<String> departureCityName;
    public String departureAirportCode3A;
    public ArrayList<String> departureAirportName;
    public Object arrivalStation;
    public ArrayList<String> arrivalCityName;
    public String arrivalAirportCode3A;
    public ArrayList<String> arrivalAirportName;
    public String marketingCompany;
    public Object operatingCompany;
    public String flightNumber;
    public String typeOfAircraft;
    public int stopsCount;
    public String legDuration;
    public int carrierCode;
    public ArrayList<FareCityPairList> fareCityPairList;
    public Object transitFlightDetailList;
    public AvailableClasses availableClasses;

}
