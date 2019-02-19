import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PokerClient {

    private List<Card> hand = new ArrayList<>();

    public PokerClient(List<String> handCodes) {
        for (String cardCode : handCodes) {
            hand.add(new Card(cardCode));
        }
    }

    public boolean highestCardIsMine(List<String> opponentHandCodes) {
        List<Card> opponentHand = new ArrayList<>();
        Card hc = new Card("s2");

        for (String cardCode : opponentHandCodes) {
            opponentHand.add(new Card(cardCode));
        }

        Card opponentHighestCard = opponentHand.stream()
                .max(Comparator.comparing(Card::getValue))
                .get();

        Card myHighestCard = this.hand.stream()
                .max(Comparator.comparing(Card::getValue))
                .get();

        return myHighestCard.getValue() > opponentHighestCard.getValue();
    }

}