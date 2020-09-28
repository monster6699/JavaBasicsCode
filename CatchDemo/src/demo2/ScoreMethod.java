package demo2;

public class ScoreMethod {
    public static void checkScore (int num) throws ScoreExpection {
        if(num < 0 || num > 100){
            throw new ScoreExpection("分数范围错误");
        } else {
            System.out.println(num);
        }
    }
}
