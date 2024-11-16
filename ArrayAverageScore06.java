import java.util.Scanner;

public class ArrayAverageScore06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[] score = new int[students];
        double avgPass = 0;
        double avgFail = 0;
        double totalPassed = 0;
        double totalFailed = 0;

        for(int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + " : " );
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                avgPass += 1;
            }
            else {
                totalFailed += score[i];
                avgFail += 1;
            }
        }

        avgPass = totalPassed / avgPass;
        avgFail = totalFailed / avgFail;

        System.out.println("The average score of students who passed is " + avgPass);
        System.out.println("The average score of students who failed is " + avgFail);

        sc.close();
    }
}
