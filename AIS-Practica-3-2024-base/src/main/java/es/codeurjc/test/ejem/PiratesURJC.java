package es.codeurjc.test.ejem;

public class PiratesURJC {

    public String play(String ronda) {
        char letter = ronda.charAt(1);
        int maxValue = Character.getNumericValue(ronda.charAt(0));
        int player = 0;
        boolean firstN=false;
        String[] playersArray = ronda.split(" ");
        boolean specialCart = false;
        boolean pirate = false;
        boolean skull_king = false;


        for (int i = 0; i < playersArray.length; i++) {
            char player_Colour = playersArray[i].charAt(1);
            int player_Number = Character.getNumericValue(playersArray[i].charAt(0));

            if (playersArray[i].equals("SR") || playersArray[i].equals("PR") || playersArray[i].equals("SK")){
                specialCart = true;
                if (playersArray[i].equals("SK")){
                    skull_king = true;
                    player = i;
                    if ((i != playersArray.length-1)&&(playersArray[i+1].equals("SR"))){
                        player = i+1;
                    }
                }
                if (playersArray[i].equals("PR") && !skull_king) {
                    pirate = true;
                    player = i;
                }
                if (playersArray[i].equals("SR") && !(pirate || skull_king)){
                    player = i;
                }
            }

            if (('N'==player_Colour) && !specialCart){
                if (!firstN){
                    maxValue = player_Number;
                    player = i;
                    firstN=true;
                    letter='N';
                }

            }
            if ((letter == player_Colour) && !specialCart) {
                if (maxValue < player_Number) {
                    maxValue = player_Number;
                    player = i;
                }
            }
        }
        return "Gana jugador " + (player+1);
    }
}

