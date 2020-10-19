public class StudentScore {
    private String name;
    private int math;
    private int chinese;
    private int english;

    public StudentScore() {
    }

    public StudentScore(String name, int math, int chinese, int english) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int sum() {
        return this.chinese + this.math + this.english;
    }
}
