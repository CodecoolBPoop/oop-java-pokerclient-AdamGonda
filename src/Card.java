import java.util.HashMap;

public class Card {

    String cardCode;
    private String validColors = "SCDH";
    private String validHighCards = "JQKA";

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode.toUpperCase();

        String cardColor = this.cardCode.substring(0, 1);
        String cardValue = this.cardCode.substring(1);
        int intCardValue;

        if (!validColors.contains(cardColor)) {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        if (!validHighCards.contains(cardValue)) {

            try{
                intCardValue = Integer.parseInt(cardValue);
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("card number isn't valid: " + cardValue);
            }

            if (intCardValue < 2 || intCardValue > 10) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
        }
    }

    public int getValue() {

        String cardValue = cardCode.substring(1);
        int intCardValue = 0;

        if (!validHighCards.contains(cardValue)) {
            intCardValue = Integer.parseInt(cardValue);
        } else {
            switch (cardCode.substring(1)){
                case "J": intCardValue = 11; break;
                case "Q": intCardValue = 12; break;
                case "K": intCardValue = 13; break;
                case "A": intCardValue = 14; break;
            }
        }
        return intCardValue;
    }
}
