import java.util.Arrays;

public class Scrabble {

    public int computeScore(String word) {

        String[] splitedWord = word.split("");
        return Arrays.stream(splitedWord)
                .mapToInt(LetterPoints::getPointsByLetter)
                .sum();

    }



}
