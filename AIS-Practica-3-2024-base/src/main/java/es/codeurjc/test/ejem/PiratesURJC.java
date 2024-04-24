package es.codeurjc.test.ejem;

public class PiratesURJC {
    private static final String MERMAID = "SR";
    private static final String PIRATE = "PR";
    private static final String SKULL_KING = "SK";
    private static final String KRAKEN = "KK";
    private static final char YELLOW = 'A';
    private static final char PURPLE = 'M';
    private static final char GREEN = 'V';
    private static final char BLACK = 'N';

    public String play(String ronda) {
        char letter = ' ';
        int maxValue = Character.isDigit(ronda.charAt(0)) ? Character.getNumericValue(ronda.charAt(0)) : 0;

        int player = 0;
        boolean firstN = false;
        String[] playersArray = ronda.split(" ");
        boolean specialCart = false;
        boolean pirate = false;
        boolean skull_king = false;
        boolean kraken = false;
        int allFigures = 0;
        int maxNumericValue = 0;
        int player_Number;

        boolean foundSpecialCart = false;

        for (int i = 0; i < playersArray.length; i++) {
            char player_Colour = playersArray[i].charAt(1);
            player_Number = Character.isDigit(playersArray[i].charAt(0)) ? Character.getNumericValue(playersArray[i].charAt(0)) : 0;

            if (isColorOfInterest(player_Colour) && !foundSpecialCart) {
                letter = player_Colour;
                foundSpecialCart = true;
            }

            if (isSpecialCard(playersArray[i]) && !kraken) {
                specialCart = true;
                if (playersArray[i].equals(KRAKEN)) {
                    kraken = true;
                    specialCart = false;
                    player = maxNumericValue;
                }
                if (playersArray[i].equals(SKULL_KING) && !kraken) {
                    skull_king = true;
                    if (playersArray[i].equals(SKULL_KING)) {
                        player = handleSkullKing(playersArray, i, kraken);
                    }
                }
                if (playersArray[i].equals(PIRATE) && !(skull_king || kraken)) {
                    pirate = true;
                    if ((i != playersArray.length - 1) && !(playersArray[i + 1].equals(KRAKEN))) {
                        player = i;
                    }
                    if (i == playersArray.length - 1) {
                        player = i;
                    }
                }
                if (playersArray[i].equals(MERMAID) && !(pirate || skull_king || kraken)) {
                    player = i;
                }
            }

            // Comprobación para verificar si todas las cartas son figuras
            if (!isFigure(playersArray[i])) {
                allFigures = allFigures + 1;
            }

            if ((BLACK == player_Colour) && !specialCart) {
                if (!firstN) {
                    maxValue = player_Number;
                    player = i;
                    firstN = true;
                    letter = BLACK;
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

        if (kraken && allFigures == playersArray.length - 1 && playersArray.length == 1) {
            for (int i = 0; i < playersArray.length; i++) {
                if (playersArray[i].equals(KRAKEN)){
                    return "Gana jugador " + (i);
                }
            }

        }

        return "Gana jugador " + (kraken ? (maxNumericValue + 1) : (player+1));
    }

    private boolean isFigure(String card) {
        return card.equals(MERMAID) || card.equals(PIRATE) || card.equals(SKULL_KING);
    }
    private boolean isSpecialCard(String card) {
        return card.equals(MERMAID) || card.equals(PIRATE) || card.equals(SKULL_KING) || card.equals(KRAKEN);
    }
    private int handleSkullKing(String[] playersArray, int index, boolean kraken) {
        if (!kraken) {
            if (index != playersArray.length - 1) {
                if (playersArray[index + 1].equals(MERMAID)) {
                    return index + 1;  // Skip Skull King and return the index of the player who played the Sirena
                } else if (!playersArray[index + 1].equals(KRAKEN)) {
                    return index;  // Return the index of Skull King if it's not followed by Kraken or Sirena
                }
            }
            return index;  // Returns the current player index if it's the last card or no special conditions are met
        }
        return index;  // Default return if kraken is true
    }
    private boolean isColorOfInterest(char color) {
        return color == BLACK || color == YELLOW || color == PURPLE || color == GREEN;
    }
}