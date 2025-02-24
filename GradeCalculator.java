import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Get student's score
        int score = getStudentScore();

        // Calculate the grade
        String grade = calculateGrade(score);

        // Display the result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score
    public static int getStudentScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        input.close();
        return score;
    }

    // Method to determine the letter grade
    public static String calculateGrade(int score) {
        if (score >= 90) {
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
}
