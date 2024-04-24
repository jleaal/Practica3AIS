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

    @Test
    @DisplayName("Test R3_2 (2V 7V 4V 1N)")
    public void TestR3_2 (){
        funcionComparativa("Gana jugador 4", "2V 7V 4V 1N");
    }

    @Test
    @DisplayName("Test R3_3 (7M 4N 1N 8V)")
    public void TestR3_3 (){
        funcionComparativa("Gana jugador 2", "7M 4N 1N 8V");
    }

    @Test
    @DisplayName("Test R4_1 (2V 6M 3N SR)")
    public void TestR4_1 (){
        funcionComparativa("Gana jugador 4", "2V 6M 3N SR");
    }

    @Test
    @DisplayName("Test R4_2 (2V SR 4V 1N)")
    public void TestR4_2 (){
        funcionComparativa("Gana jugador 2", "2V SR 4V 1N");
    }

    @Test
    @DisplayName("Test R5_1 (7M SR SR 8V)")
    public void TestR5_1 (){
        funcionComparativa("Gana jugador 3", "7M SR SR 8V");
    }

    @Test
    @DisplayName("Test R6_1 (2V PR 3N 1N)")
    public void TestR6_1 (){
        funcionComparativa("Gana jugador 2", "2V PR 3N 1N");
    }

    @Test
    @DisplayName("Test R7_1 (8A PR 1N PR)")
    public void TestR7_1 (){
        funcionComparativa("Gana jugador 4", "8A PR 1N PR");
    }

    @Test
    @DisplayName("Test R8_1 (9V PR 4V SR)")
    public void TestR8_1 (){
        funcionComparativa("Gana jugador 2", "9V PR 4V SR");
    }

    @Test
    @DisplayName("Test R8_2 (SR SR PR SR)")
    public void TestR8_2 (){
        funcionComparativa("Gana jugador 3", "SR SR PR SR");
    }

    @Test
    @DisplayName("Test R9_1 (7N 8A 1V SK)")
    public void TestR9_1 (){
        funcionComparativa("Gana jugador 4", "7N 8A 1V SK");
    }

    @Test
    @DisplayName("Test R9_2 (2V PR SK 1N)")
    public void TestR9_2 (){
        funcionComparativa("Gana jugador 3", "2V PR SK 1N");
    }

    @Test
    @DisplayName("Test R9_3 (1N SK 4V SR)")
    public void TestR9_3 (){
        funcionComparativa("Gana jugador 2", "1N SK 4V SR");
    }

    @Test
    @DisplayName("Test R10_1 (PR SK SR SR)")
    public void TestR10_1 (){
        funcionComparativa("Gana jugador 3", "PR SK SR SR");
    }

    @Test
    @DisplayName("Test R11_1 (1V KK SR)")
    public void TestR11_1 (){
        funcionComparativa("Gana jugador 1", "1V KK SR");
    }

    @Test
    @DisplayName("Test R11_2 (5A PR KK)")
    public void TestR11_2 (){
        funcionComparativa("Gana jugador 1", "5A PR KK");
    }

    @Test
    @DisplayName("Test R11_3 (7M SK KK)")
    public void TestR11_3 (){
        funcionComparativa("Gana jugador 1", "7M SK KK");
    }

   @Test
    @DisplayName("Test R11_4 (KK SK 5A SR)")
    public void TestR11_4 (){
        funcionComparativa("Gana jugador 3", "KK SK 5A SR");
    }

    @Test
    @DisplayName("Test R12_1 (“PR KK SR PR)")
    public void TestR12_1 (){
        funcionComparativa("Gana jugador 2", "“PR KK SR PR");
    }
}
