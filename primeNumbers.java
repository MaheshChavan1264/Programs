import java.util.Arrays;
import java.util.Scanner;

public class primeNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int n2 = scanner.nextInt();
        String numbers = primes(n1, n2);
        if(isPrime(n2)){
            System.out.println(numbers.substring(0,numbers.length()-1));
        }
        else{
            System.out.println(numbers+nextPrime(n2));
        }
    }

    public static String primes(int n1, int n2) {
        int i = 0;
        int num = 0;
        String primeNums = "";
        for (i = n1; i <= n2; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                if (i % 10 == 1) {
                    primeNums = primeNums + i + ",";
                }
            }
        }
        return primeNums;
    }

    public static int nextPrime(int num) {
        if (num <= 1) {
            return 2;
        }
        int prime = num;
        boolean found = false;
        while (!found) {
            prime++;
            if (isPrime(prime)) {
                if (checkPrime(prime)) {
                    found = true;
                }
            }
        }
        return prime;
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        return true;
    }
    public static boolean checkPrime(int num){
        if(num%10==1){
            return true;
        }
        else{
            return false;
        }
    }
}