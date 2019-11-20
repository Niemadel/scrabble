import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrabbleTest {

    @Test
    void given_word_A_return_score_of_one(){
        Scrabble scrabble = new Scrabble();
        String word = "A";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(1);
    }

    @Test
    void given_word_AA_return_score_of_two() {
        Scrabble scrabble = new Scrabble();
        String word = "AA";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(2);
    }
}
