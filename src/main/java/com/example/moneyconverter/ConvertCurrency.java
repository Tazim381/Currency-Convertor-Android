package com.example.moneyconverter;

public class ConvertCurrency {

    public  static  double usdBDT(double usdBDT) {
        usdBDT = usdBDT*107;
        return usdBDT;
    }

    public  static  double bdtUSD(double bdtUSD) {
        bdtUSD = bdtUSD/107;
        return bdtUSD;
    }

    public  static  double inrUSD(double inrUSD) {
        inrUSD= inrUSD/82;
        return inrUSD;
    }
}
