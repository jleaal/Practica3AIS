package es.codeurjc.test.ejem;

public class PiratesURJC {

    public String play(String ronda) {
        char letra = ronda.charAt(1);
        int valorMax = Character.getNumericValue(ronda.charAt(0));
        int jugador = 0;
        boolean esPrimeraN=false;
        String[] jugadoresArray = ronda.split(" ");

        for (int i = 0; i < jugadoresArray.length; i++) {
            char jugadorLetra = jugadoresArray[i].charAt(1);
            int jugadorValor = Character.getNumericValue(jugadoresArray[i].charAt(0));

            if ('R'==jugadorLetra){
                return "Gana jugador " + (i+1);
            }

            if ('N'==jugadorLetra){
                if (!esPrimeraN){
                    valorMax = jugadorValor;
                    jugador = i;
                    esPrimeraN=true;
                    letra='N';
                }

            }
            if (letra == jugadorLetra) {
                if (valorMax < jugadorValor) {
                    valorMax = jugadorValor;
                    jugador = i;
                }
            }
        }
        return "Gana jugador " + (jugador+1);
    }


}

