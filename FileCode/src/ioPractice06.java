import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class ioPractice06 {
    public static void main(String[] args) throws IOException {
        TreeSet<StudentScore> studentScores = new TreeSet<>(new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore s1, StudentScore s2) {
                int num = s1.sum() - s2.sum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });
        studentScores.add(new StudentScore("武松", 95, 80, 60));
        studentScores.add(new StudentScore("武大郎", 100, 60, 60));
        studentScores.add(new StudentScore("潘金莲", 100, 100, 95));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/c.txt"));
        for (StudentScore stu :
                studentScores) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stu.getName()).append(",").append(stu.getChinese()).append(",").append(stu.getEnglish()).append(",").append(stu.getMath()).append(",").append(stu.sum());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        bufferedWriter.close();
    }
}
