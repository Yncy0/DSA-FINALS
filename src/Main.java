import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("DSA FINAL EXAM");
        System.out.println(Arrays.toString(testArray));
        System.out.print("Enter an item you want to find: ");
        int input = scanner.nextInt();

        linearSearch(testArray, input);

    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(i);
            if (arr[i] == target) {
                System.out.println("The target is in the index of " + i);
                return i;
            }
        }

        return -1;
    }
}