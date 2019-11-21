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

    @Test
    void given_word_AB_return_score_of_two() {
        Scrabble scrabble = new Scrabble();
        String word = "AB";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(4);
    }

    @Test
    void given_word_ABCD_return_score_of_two() {
        Scrabble scrabble = new Scrabble();
        String word = "ABCD";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(9);
    }

    @Test
    void given_word_CABBAGE_return_score_of_fourteen() {
        Scrabble scrabble = new Scrabble();
        String word = "CABBAGE";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(14);
    }

    @Test
    void given_word_XYLOPHONE_return_score_of_twenty_four() {
        Scrabble scrabble = new Scrabble();
        String word = "XYLOPHONE";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(24);
    }

    @Test
    void given_blank_return_score_of_0() {
        Scrabble scrabble = new Scrabble();
        String word = " ";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(0);
    }

    @Test
    void given_unsuported_character_single_quote_return_score_of_0() {
        Scrabble scrabble = new Scrabble();
        String word = "'";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(0);
    }

    @Test
    void given_unsuported_character_arobase_return_score_of_0() {
        Scrabble scrabble = new Scrabble();
        String word = "@";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(0);
    }

    @Test
    void given_string_with_blank_return_score_of_0() {
        Scrabble scrabble = new Scrabble();
        String word = "LA VIE EST BELLE";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(18);

    }

    @Test
    void given_empty_string_return_score_of_0() {
        Scrabble scrabble = new Scrabble();
        String word = "";

        int score = scrabble.computeScore(word);

        assertThat(score).isEqualTo(0);
    }

}
