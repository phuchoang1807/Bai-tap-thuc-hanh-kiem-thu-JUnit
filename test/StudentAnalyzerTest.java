import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    /* ===============================
       TEST countExcellentStudents()
       =============================== */

    @Test
    public void testCountExcellentStudents_normal_mixValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(2, result);
    }

    @Test
    public void testCountExcellentStudents_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(8.0, 8.5, 9.0, 10.0, 7.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(4, result);
    }

    @Test
    public void testCountExcellentStudents_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(Collections.emptyList());

        assertEquals(0, result);
    }

    @Test
    public void testCountExcellentStudents_invalidOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-1.0, 11.0, 100.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(0, result);
    }

    /* ===============================
       TEST calculateValidAverage()
       =============================== */

    @Test
    public void testCalculateValidAverage_normal_mixValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        double result = analyzer.calculateValidAverage(scores);

        assertEquals(8.17, result, 0.01);
    }

    @Test
    public void testCalculateValidAverage_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(6.0, 7.0, 8.0, 9.0);

        double result = analyzer.calculateValidAverage(scores);

        assertEquals(7.5, result, 0.0001);
    }

    @Test
    public void testCalculateValidAverage_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        double result = analyzer.calculateValidAverage(Collections.emptyList());

        assertEquals(0, result, 0.0001);
    }

    @Test
    public void testCalculateValidAverage_invalidOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-5.0, 11.0);

        double result = analyzer.calculateValidAverage(scores);

        assertEquals(0, result, 0.0001);
    }
}
