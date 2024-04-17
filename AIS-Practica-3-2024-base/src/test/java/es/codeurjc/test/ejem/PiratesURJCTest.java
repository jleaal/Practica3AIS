package es.codeurjc.test.ejem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiratesURJCTest {

    public void funcionComparativa (String salida, String ronda) {
        PiratesURJC partida = new PiratesURJC();
        String resultado = partida.play(ronda);
        assertEquals(salida, resultado);
    }

    @Test
    @DisplayName("Test R1_1 (1M 4M)")
    public void TestR1_1 (){
        funcionComparativa("Gana jugador 2", "1M 4M");
    }

    @Test
    @DisplayName("Test R1_2 (5M 2M)")
    public void TestR1_2 (){
        funcionComparativa("Gana jugador 1", "5M 2M");
    }

    @Test
    @DisplayName("Test R1_3 (1M 2M 4M)")
    public void TestR1_3 (){
        funcionComparativa("Gana jugador 3", "1M 2M 4M");
    }

    @Test
    @DisplayName("Test R1_4 (5M 2M 4M 7M)")
    public void TestR1_4 (){
        funcionComparativa("Gana jugador 4", "5M 2M 4M 7M");
    }

    @Test
    @DisplayName("Test R2_1 (1M 4A 2M 7V)")
    public void TestR2_1 (){
        funcionComparativa("Gana jugador 3", "1M 4A 2M 7V");
    }

    @Test
    @DisplayName("Test R2_2 (2A 7V 4V 1A)")
    public void TestR2_2(){
        funcionComparativa("Gana jugador 1", "2A 7V 4V 1A");
    }

    @Test
    @DisplayName("Test R2_3 (7V 9M 1M 8V)")
    public void TestR2_3(){
        funcionComparativa("Gana jugador 4", "7V 9M 1M 8V");
    }

    @Test
    @DisplayName("Test R3_1 (2V 6M 3N 8V)")
    public void TestR3_1 (){
        funcionComparativa("Gana jugador 3", "2V 6M 3N 8V");
    }

}
