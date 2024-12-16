import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        linearSearch(testArray, input);

    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}