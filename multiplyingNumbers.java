import java.util.Scanner;

public class multiplyingNumbers{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first, second, terms;
        first = scanner.nextInt();
        if (first <= 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Enter the second number:");
            second = scanner.nextInt();
            if ((first == second)) {
                System.out.println("Invalid Input");
            } else if (second <= 0) {
                System.out.println("Invalid Input");
            } else if (first > second) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("Enter the number of terms:");
                terms = scanner.nextInt();
                if (terms <= 0) {
                    System.out.println("Invalid Input");
                } else {
                    System.out.print(first + "," + second);
                    for (int i = 0; i < terms; i++) {
                        int product = first * second;
                        System.out.print("," + product);
                        first = second;
                        second = product;
                    }
                }
            }
        }
    }
}
