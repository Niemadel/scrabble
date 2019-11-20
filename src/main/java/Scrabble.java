public class Scrabble {

    public int computeScore(String word) {

        int score = 0;
        for (char letter : word.toCharArray()) {
            score += getLetterScore(letter);
        }
        return score;

    }

    private int getLetterScore(char letter) {
        int letterScore = 0;
        if (letter == 'A') {
            letterScore = letterScore + 1;
        }

        return letterScore;
    }
}
