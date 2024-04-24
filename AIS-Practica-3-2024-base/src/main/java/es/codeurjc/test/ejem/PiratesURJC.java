package es.codeurjc.test.ejem;

public class PiratesURJC {

    public String play(String ronda) {
        char letter= 'X';
        int maxValue;

        if (!Character.isLetter(ronda.charAt(0))){
            maxValue=Character.getNumericValue(ronda.charAt(0));
        } else {
            maxValue=0;
        }
        boolean entrado=false;

        int player = 0;
        boolean firstN=false;
        String[] playersArray = ronda.split(" ");
        boolean specialCart = false;
        boolean pirate = false;
        boolean skull_king = false;
        boolean kraken = false;
        int maxNumericValue = 0;
        int player_Number;


        for (int i = 0; i < playersArray.length; i++) {
            char player_Colour = playersArray[i].charAt(1);

            if (!Character.isLetter(playersArray[i].charAt(0))){
                player_Number=Character.getNumericValue(playersArray[i].charAt(0));
            } else {
                player_Number=0;
            }

            if (((playersArray[i].charAt(1)=='N')||(playersArray[i].charAt(1)=='A')||(playersArray[i].charAt(1)=='M')||(playersArray[i].charAt(1)=='V'))&&(!entrado)){
                letter=playersArray[i].charAt(1);
                entrado=true;
            }

            if (((playersArray[i].equals("SR") || playersArray[i].equals("PR") || playersArray[i].equals("SK") || playersArray[i].equals("KK"))) && !kraken){
                specialCart = true;
                if (playersArray[i].equals("KK")){
                    kraken = true;
                    specialCart = false;
                    player = maxNumericValue;
                }
                if (playersArray[i].equals("SK") && !kraken){
                    skull_king = true;
                    if ((i != playersArray.length-1)&&!(playersArray[i+1].equals("KK"))){
                        player = i;
                    }
                    if(i == playersArray.length-1){
                        player = i;
                    }
                    if ((i != playersArray.length-1)&&(playersArray[i+1].equals("SR"))){
                        player = i+1;
                    }
                }
                if (playersArray[i].equals("PR") && !(skull_king || kraken)) {
                    pirate = true;
                    if ((i != playersArray.length-1)&&!(playersArray[i+1].equals("KK"))){
                        player = i;
                    }
                    if(i == playersArray.length-1){
                        player = i;
                    }
                }
                if (playersArray[i].equals("SR") && !(pirate || skull_king || kraken)){
                    player = i;
                }
            }

            if (('N'==player_Colour) && !specialCart){
                if (!firstN){
                    maxValue = player_Number;
                    player = i;
                    firstN=true;
                    letter='N';
                    maxNumericValue = i;
                }

            }
            if (!specialCart && (letter == player_Colour)) {
                if (maxValue < player_Number) {
                    maxValue = player_Number;
                    player = i;
                    maxNumericValue = i;
                }
            }
        }
        if (kraken){
            return "Gana jugador " + (maxNumericValue + 1);
        }
        return "Gana jugador " + (player+1);
    }
}

