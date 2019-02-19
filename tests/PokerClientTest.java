import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {
    //highestCardIsMine()

    @Test
    void testHighestCardIsMine(){
        PokerClient pokerClient = new PokerClient(Arrays.asList("h3", "d2", "s3", "s4", "cq"));
        boolean result = pokerClient.highestCardIsMine(Arrays.asList("s3", "h4", "s5", "d6", "sj"));
        assertTrue(result);

        pokerClient = new PokerClient(Arrays.asList("h3", "d2", "s3", "s4", "c2"));
        result = pokerClient.highestCardIsMine(Arrays.asList("s3", "h4", "s5", "d6", "sj"));
        assertFalse(result);


        pokerClient = new PokerClient(Arrays.asList("h3", "dk", "s3", "s4", "c2"));
        result = pokerClient.highestCardIsMine(Arrays.asList("s3", "h4", "s5", "d6", "sj"));
        assertTrue(result);

        pokerClient = new PokerClient(Arrays.asList("h3", "dk", "s3", "s4", "c2"));
        result = pokerClient.highestCardIsMine(Arrays.asList("sa", "h4", "s5", "d6", "sj"));
        assertFalse(result);
    }
}