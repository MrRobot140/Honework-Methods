import java.util.Scanner;

public class PatternGenerator {

    public static void printRightTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printInvertedTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int s = 1; s <= size - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printInvertedPyramid(int size) {
        for (int i = size; i >= 1; i--) {
            for (int s = 1; s <= size - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printNumberTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than 0.");
        } else {
            System.out.println("Choose the pattern type:");
            System.out.println("1 - Right Triangle");
            System.out.println("2 - Inverted Right Triangle");
            System.out.println("3 - Pyramid");
            System.out.println("4 - Inverted Pyramid");
            System.out.println("5 - Number Triangle");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\nSize: " + size + "\nPattern: Right Triangle");
                    printRightTriangle(size);
                }
                case 2 -> {
                    System.out.println("\nSize: " + size + "\nPattern: Inverted Right Triangle");
                    printInvertedTriangle(size);
                }
                case 3 -> {
                    System.out.println("\nSize: " + size + "\nPattern: Pyramid");
                    printPyramid(size);
                }
                case 4 -> {
                    System.out.println("\nSize: " + size + "\nPattern: Inverted Pyramid");
                    printInvertedPyramid(size);
                }
                case 5 -> {
                    System.out.println("\nSize: " + size + "\nPattern: Number Triangle");
                    printNumberTriangle(size);
                }
                default -> System.out.println("Invalid choice. Choose between 1 and 5.");
            }
        }
        sc.close();
    }
}