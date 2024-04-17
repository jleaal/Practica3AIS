package es.codeurjc.test.ejem;

public class PiratesURJC {

    public String play(String ronda) {
        char letra = ronda.charAt(1);
        int valorMax = Character.getNumericValue(ronda.charAt(0));
        int jugador = 0;
        boolean esPrimeraN=false;
        String[] jugadoresArray = ronda.split(" ");
        boolean cartaEspecial = false;
        boolean pirata = false;
        boolean sk = false;


        for (int i = 0; i < jugadoresArray.length; i++) {
            char jugadorLetra = jugadoresArray[i].charAt(1);
            int jugadorValor = Character.getNumericValue(jugadoresArray[i].charAt(0));

            if (jugadoresArray[i].equals("SR") || jugadoresArray[i].equals("PR") || jugadoresArray[i].equals("SK")){
                cartaEspecial = true;
                if (jugadoresArray[i].equals("SK")){
                    sk = true;
                    jugador = i;
                }
                if (jugadoresArray[i].equals("PR") && !sk) {
                    pirata = true;
                    jugador = i;
                }
                if (jugadoresArray[i].equals("SR") && !pirata){
                    jugador = i;
                }
            }

            if (('N'==jugadorLetra) && !cartaEspecial){
                if (!esPrimeraN){
                    valorMax = jugadorValor;
                    jugador = i;
                    esPrimeraN=true;
                    letra='N';
                }

            }
            if ((letra == jugadorLetra) && !cartaEspecial) {
                if (valorMax < jugadorValor) {
                    valorMax = jugadorValor;
                    jugador = i;
                }
            }
        }
        return "Gana jugador " + (jugador+1);
    }
}

