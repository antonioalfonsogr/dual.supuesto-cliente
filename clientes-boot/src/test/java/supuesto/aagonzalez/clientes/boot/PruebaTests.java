package supuesto.aagonzalez.clientes.boot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PruebaTests {

    @Test
    @DisplayName("assert true")
    void pruebaBolean() {
        boolean verdadero = true;
        assertTrue(verdadero);
    }

    @Test
    @DisplayName("assert equals")
    void pruebaEquals() {
        String cadenaEsperada = "esperada";
        String cadenaActual = "esperada";
        assertEquals(cadenaEsperada, cadenaActual);
    }

    @Test
    @DisplayName("assert array equals")
    void pruebaArray() {
        String[] cadenasEsperadas = {"cadena1", "cadena2", "cadena3"};
        String[] cadenasActuales = {"cadena1", "cadena2", "cadena3"};
        assertArrayEquals(cadenasEsperadas, cadenasActuales);
    }

    @Test
    @DisplayName("assert iterable equals")
    void pruebaIterable() {
        ArrayList<String> cadenasEsperadas = new ArrayList<>();
        ArrayList<String> cadenasActuales = new ArrayList<>();
        cadenasEsperadas.add("cadena1");
        cadenasEsperadas.add("cadena2");
        cadenasEsperadas.add("cadena3");
        cadenasActuales.add("cadena1");
        cadenasActuales.add("cadena2");
        cadenasActuales.add("cadena3");
        assertIterableEquals(cadenasEsperadas, cadenasActuales);
    }

    @Test
    @DisplayName("assert throws")
    void pruebaThrows() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            String[] arr = {"cadena1", "cadena2", "cadena3"};
            System.out.println(arr[5]);
        });
    }

    @Test
    @DisplayName("assert timeout")
    void pruebaTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(10));
    }

    @Test
    @DisplayName("assert all")
    void pruebaAll() {
        assertAll(
                () -> assertTrue(true),
                () -> assertFalse(false)
        );
    }

}
