package es.codeurjc.test.ejem;

import java.util.ArrayList;
import java.util.Arrays;

public class PiratesURJC {

    public String play(String ronda){
        char letra= ronda.charAt(1);
        int valorAct= ronda.charAt(0);
        int jugador=1;
        String[] jugadoresArray = ronda.split(" ");
        for (int i = 1; i < jugadoresArray.length; i++) {
            if (letra == jugadoresArray[i].charAt(1)){
                if (valorAct<jugadoresArray[i].charAt(0)){
                    valorAct=jugadoresArray[i].charAt(0);
                    jugador=i;
                }
            }
        }
        return "Gana jugador " + jugador;
}

