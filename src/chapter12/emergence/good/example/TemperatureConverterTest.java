package chapter12.emergence.good.example;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TemperatureConverterTest {
    private final TemperatureConverter conv = new TemperatureConverter();

    @Test
    void celsiusToFahrenheit_zeroCelsius_is32F() {
        assertEquals(32.0, conv.celsiusToFahrenheit(0), 0.0001);
    }

    @Test
    void celsiusToKelvin_zeroCelsius_is273Point15K() {
        assertEquals(273.15, conv.celsiusToKelvin(0), 0.0001);
    }
}
