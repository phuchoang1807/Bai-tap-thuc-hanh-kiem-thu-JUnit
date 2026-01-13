import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentAnalyzer studentAnalyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        double averageScore = studentAnalyzer.calculateValidAverage(scores);


        int excellentCount = studentAnalyzer.countExcellentStudents(scores);

        System.out.println("Danh sách điểm: " + scores);
        System.out.println("Số lượng sinh viên loại giỏi (>= 8.0): " + excellentCount);
        System.out.println("Điểm trung bình hợp lệ: " + averageScore);

    }
}
