public class Scrabble {

    public int computeScore(String word){
        int score = 0;
        if (word.contains("A")){
            score = score + 1;
        }
        return score;
    }
}
