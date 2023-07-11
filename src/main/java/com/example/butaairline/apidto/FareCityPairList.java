package com.example.butaairline.apidto;

import lombok.Data;

import java.util.ArrayList;
@Data
public class FareCityPairList {
    public String rateClass;
    public String globalClass;
    public String bookingClass;
    public String globalSubClass;
    public Object codeShare;
    public String company;
    public String directionCode;
    public double totalFare;
    public double allTotalFare;
    public double fare;
    public double taxes;
    public double extraTaxes;
    public String currency;
    public int flightClassTypeCode;
    public boolean exists;
    public ArrayList<PassengerFareDetailList> passengerFareDetailList;
    public ArrayList<Object> taxesList;
}
