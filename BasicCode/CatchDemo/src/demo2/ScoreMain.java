package demo2;


public class ScoreMain {
    public static void main(String[] args) {
        int num = 200;
        try {
            ScoreMethod.checkScore(num);
        } catch (ScoreExpection scoreExpection) {
            scoreExpection.printStackTrace();
        }

    }
}
