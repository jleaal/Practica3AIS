package es.codeurjc.test.ejem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiratesURJCTest {

    public void testR1(String salida, String ronda) {
        PiratesURJC partida = new PiratesURJC();
        String resultado = partida.play(ronda);
        assertEquals(resultado, salida);
    }

    @Test
    @DisplayName("Test R1 (1M 4M)")
    public void TestR1_1 (){
        testR1("Gana jugador 2", "1M 4M");
    }
}
