import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        PokerClient pokerClient = new PokerClient(Arrays.asList(
                "h3", "d2", "s3", "s4", "cq"
        ));
        System.out.println("the highest card is mine: " + pokerClient.highestCardIsMine(Arrays.asList("s3", "h4", "s5", "d6", "sj")));
        System.out.println("the highest card is mine: " + pokerClient.highestCardIsMine(Arrays.asList("s3", "h4", "s5", "d6", "sk")));
    }

    //Do not rename the methods
    //Do not add new classes or methods
    //So your previous tests should stay green without touching them at all!

}
