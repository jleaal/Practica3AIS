package es.codeurjc.test.ejem;

public class PiratesURJC {

    public String play(String ronda) {
        char letra = ronda.charAt(1);
        int valorMax = Character.getNumericValue(ronda.charAt(0));
        int jugador = 0;
        String[] jugadoresArray = ronda.split(" ");
        for (int i = 1; i < jugadoresArray.length; i++) {
            if (letra == jugadoresArray[i].charAt(1)) {
                if (valorMax < Character.getNumericValue(jugadoresArray[i].charAt(0))) {
                    valorMax = Character.getNumericValue(jugadoresArray[i].charAt(0));
                    jugador = i;
                }
            }
        }
        return "Gana jugador " + (jugador+1);
    }
}

