package com.example.tute2;

public class Calculations {

    //convertCelciusToFahrenheit
    protected float convertCelciusToFahrenheit(Float value) {
        Float ans = (value * 9/5) + 32;
        return ans;
    }

    //convertFahrenheitToCelcius
    protected float convertFahrenheitToCelcius(Float value) {
        Float ans = (value - 32) * 5/9;
        return ans;
    }


}
