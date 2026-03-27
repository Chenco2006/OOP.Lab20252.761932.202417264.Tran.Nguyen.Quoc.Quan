import java.util.Arrays;
import java.util.Scanner;

public class SortANumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to (1) Use constant array or (2) Enter own array?");
        int choice = sc.nextInt();
        
        double[] array;

        if (choice == 1) {
            array = new double[]{1789, 2035, 1899, 1456, 2013};
        } else {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            array = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = sc.nextDouble();
            }
        }
        
        System.out.println("\nInitial array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value: " + average);

        sc.close();
    }
}