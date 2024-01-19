import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            int marks;
            do {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                marks = scanner.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Please enter valid marks (0-100).");
                }
            } while (marks < 0 || marks > 100);

            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        char grade = calculateGrade(averagePercentage);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) return 'A';
        else if (averagePercentage >= 80) return 'B';
        else if (averagePercentage >= 70) return 'C';
        else if (averagePercentage >= 60) return 'D';
        else return 'F';
    }
}
