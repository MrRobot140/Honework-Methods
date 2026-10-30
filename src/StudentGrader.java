import java.util.Scanner;

public class StudentGrader {

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score. Enter a value from 0 to 100.";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        String grade = calculateGrade(score);
        System.out.println("Result: " + grade);
        sc.close();
    }
}