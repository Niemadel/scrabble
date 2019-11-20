public enum LetterPoints {

    ONE(1, "AEIOULNRST"), TWO(2, "DG"), THREE(3, "BCMP"), FOUR(4, "FHVWY"), FIVE(5, "K"), EIGHT(8, "JX"), TEN(10, "QZ");

    private int points;
    private String letters;

    LetterPoints(int points, String letters) {
        this.points = points;
        this.letters = letters;
    }

    public static int getPoint(String letter) {
        int points = 0;
        for (LetterPoints lt : LetterPoints.values()) {
            if (lt.letters.contains(letter)) {
                return lt.points;
            }
        }
        return points;

    }
}
