import java.util.Arrays;

public class Scrabble {

    public int computeScore(String word) {
        if (word.isEmpty()) {
            return 0;
        }
        else{
        String[] splitedWord = word.split("");
            return Arrays.stream(splitedWord)
                    .mapToInt(LetterPoints::getPointsByLetter)
                    .sum();
        }

    }


}
