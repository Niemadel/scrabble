import java.util.Arrays;

public enum LetterPoints {

    ONE(1, "AEIOULNRST"),
    TWO(2, "DG"),
    THREE(3, "BCMP"),
    FOUR(4, "FHVWY"),
    FIVE(5, "K"),
    EIGHT(8, "JX"),
    TEN(10, "QZ");

    private int points;
    private String letters;

    LetterPoints(int points, String letters) {
        this.points = points;
        this.letters = letters;
    }

    private boolean contains(String letter) {
        return letters.contains(letter);
    }

    public static int getPointsByLetter(String letter) {
        return Arrays.stream(LetterPoints.values())
                .filter(lt -> lt.contains(letter)).limit(1)
                .findFirst()
                .map(letterPoints -> letterPoints.points)
                .orElse(0);

    }
}
