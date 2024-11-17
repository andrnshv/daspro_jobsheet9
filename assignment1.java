import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of value: ");
        int numValue = sc.nextInt();
        int[] value = new int[numValue];

        for (int i = 0; i < numValue; i++) {
            System.out.print("Input the value number " + (i + 1) + ": ");
            value[i] = sc.nextInt();
        }

        double total = 0;
        int highestValue = value[0];
        int lowestValue = value[0];

        for (int i = 0; i < numValue; i++) {
            total += value[i];
            if (value[i] > highestValue) {
                highestValue = value[i];
            }
            if (value[i] < lowestValue) {
                lowestValue = value[i];
            }
        }

        double average = total / numValue;
        
        System.out.println("\nAverage value is : " + average);
        System.out.println("Highest value is : " + highestValue);
        System.out.println("Lowest Value is : " + lowestValue);
    }
}
