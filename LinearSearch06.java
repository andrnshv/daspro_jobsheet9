import java.util.Scanner;

public class LinearSearch06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array element: ");
        int num = sc.nextInt();
        int[] arrayInt = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Enter the array element: " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();

        int result = -1;

        for(int i = 0; i < arrayInt.length; i++) {
            if (key == arrayInt[i]) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found");
        }
        
        
        sc.close();
    }
}
