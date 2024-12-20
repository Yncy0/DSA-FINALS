import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //FOR TESTING PURPOSES
        int[] testArray = {51, 32, 43, 4, 5, 66, 87, 98, 39, 10};
        int[] numberArray = new int[10];


        System.out.println("DSA FINAL EXAM");
        while (true) {
            selectionMenu(scanner, numberArray);
        }

    }

    private static void selectionMenu(Scanner input, int arr[]) {
        System.out.println("================================");
        System.out.println("What do you want to do?: ");
        System.out.println("[A]: SEARCH");
        System.out.println("[B]: SORT");
        System.out.print("INPUT HERE >> ");

        String choice = input.nextLine().toLowerCase();

        while (true) {
            if (choice.equals("a")) {
                searchMenu(input, arr);
            } else if (choice.equals("b")) {
                sortMenu(input, arr);
            } else {
                System.out.println("That is not the right input :(, please prefer on the references");
                break;
            }
        }
    }

    private static void searchMenu(Scanner input, int arr[]) {
        System.out.println("================================");
        System.out.println("Please choose a SEARCHING ALGORITHM");
        System.out.println("[A]: LINEAR SEARCH");
        System.out.println("[X]: CANCEL");
        System.out.print("INPUT HERE >> ");

        String choice = input.nextLine().toLowerCase();

        while (true) {
            if (choice.equals("a")) {
                arrayRNG(arr);
                System.out.print("Please choose a target number to search >> ");

                int target = input.nextInt();
                input.nextLine();

                linearSearch(arr, target);
                return;
            } else if (choice.equals("x")) {
                selectionMenu(input, arr);
            } else {
                System.out.println("That is not the right input :(, please prefer on the references");
                break;
            }
        }
    }

    private static void sortMenu(Scanner input, int arr[]) {
        System.out.println("================================");
        System.out.println("Please choose a SORTING ALGORITHM");
        System.out.println("[A]: SELECTION SORT");
        System.out.println("[B]: BUBBLE SORT");
        System.out.println("[X]: CANCEL");
        System.out.print("INPUT HERE >> ");

        String choice = input.nextLine().toLowerCase();

        while (true) {
            if (choice.equals("a")) {
                arrayRNG(arr);
                selectionSort(arr);

                return;
            } else if (choice.equals("b")) {
                arrayRNG(arr);
                bubbleSort(arr);

                return;
            } else if (choice.equals("x")) {
                selectionMenu(input, arr);
            } else {
                System.out.println("That is not the right input :(, please prefer on the references");
                break;
            }
        }
    }

    private static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            if (arr[i] == n) {
                System.out.println("The target " + n + " Is found at index of " + i);
                return i;
            }
        }

        System.out.println("The target is not in an array");
        return -1;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSwapped = true;

        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSwapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                System.out.println("Sorting: " + Arrays.toString(arr));
            }
        }
        System.out.println("================================");
        System.out.println("The Items has been sorted! " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println("Sorting: " + Arrays.toString(arr));
        }
        System.out.println("================================");
        System.out.println("The Items has been sorted! " + Arrays.toString(arr));
    }

    private static void arrayRNG(int arr[]) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100000);
        }

        System.out.println("HERE ARE THE RANDOM GENERATED ARRAYS");
        System.out.println(Arrays.toString(arr));
        System.out.println("================================");
    }

}