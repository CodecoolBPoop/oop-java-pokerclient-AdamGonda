import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    //test constructor
    // getValue()

    @Test
    void testConstructorValidInput(){
        String input = "S2";
        String input_2 = "S10";
        String input_3 = "SK";
        String input_4 = "SA";


        Card card = new Card(input);
        assertEquals(input, card.cardCode);

        card = new Card(input_2);
        assertEquals(input_2, card.cardCode);

        card = new Card(input_3);
        assertEquals(input_3, card.cardCode);

        card = new Card(input_4);
        assertEquals(input_4, card.cardCode);
    }

    @Test
    void testConstructorInvalidInput(){
        //illegal color
        String input = "x2";
        AtomicReference<Card> card = null;
        assertThrows(IllegalArgumentException.class, () -> card.set(new Card(input)));

        //illegal number
        String input_2 = "su";
        assertThrows(IllegalArgumentException.class, () -> card.set(new Card(input_2)));
    }

    @Test
    void testGetCardValue(){
        String input = "S2";
        Card card = new Card(input);
        assertEquals(2, card.getValue());

        String input_2 = "S10";
        card = new Card(input_2);
        assertEquals(10, card.getValue());

        String input_3 = "SA";
        card = new Card(input_3);
        assertEquals(14, card.getValue());

        String input_4 = "S8";
        card = new Card(input_4);
        assertEquals(8, card.getValue());
    }

}