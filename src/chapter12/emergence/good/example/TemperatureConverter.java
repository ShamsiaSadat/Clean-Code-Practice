package chapter12.emergence.good.example;

public class TemperatureConverter {
    /** Converts °C to °F. */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32.0;
    }

    /** Converts °C to K. */
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

}
