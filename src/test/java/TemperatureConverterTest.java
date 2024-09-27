// import package

import org.junit.Test;
import static org.junit.Assert.*;


public class TemperatureConverterTest {
    private TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40.0), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.001);
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.001);
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40.0), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-60.0));
        assertTrue(converter.isExtremeTemperature(160.0));
        assertFalse(converter.isExtremeTemperature(20.0));
        assertFalse(converter.isExtremeTemperature(100.0));
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(-459.67, converter.kelvinToFahrenheit(0.0), 0.001);
        assertEquals(32.0, converter.kelvinToFahrenheit(273.15), 0.001);
        assertEquals(212.0, converter.kelvinToFahrenheit(373.15), 0.001);
    }

}

