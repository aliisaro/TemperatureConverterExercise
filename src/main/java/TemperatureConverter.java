package com.example.temperatureconverterexercise;// import package
public class TemperatureConverter {

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Checks if the given Celsius temperature is extreme.
     *
     * @param celsius The temperature in Celsius.
     * @return True if the temperature is below -40 or above 50, otherwise false.
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}

