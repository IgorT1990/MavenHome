package automation.lesson4;
import java.util.Random;

public class CardValue extends CardSuite {

    @Override
    public String[] card() {
        int noOfCards = 52;
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[noOfCards];

        int count = 0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count++] = value + "Of" + suite;
            }
        }

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfCards);

            String card = deck[in];
            deck[in] = deck[out];
            deck[out] = card;


        }
        return deck;
    }

}

