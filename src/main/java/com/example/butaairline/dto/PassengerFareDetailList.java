package com.example.butaairline.dto;

import lombok.Data;

@Data
public class PassengerFareDetailList {
    public String passengerCategory;
    public int count;
    public double fare;
    public double fareBasis;
    public double taxes;
    public double taxesBasis;
    public double extraTaxes;
    public double extraTaxesBasis;
    public double totalFare;
    public double totalFareBasis;
    public String currency;
}
