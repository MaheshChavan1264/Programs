import java.util.Scanner;

public class nextPrime {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        System.out.println(NextPrime(n1));
    }
    public static int NextPrime(int num) {
        if (num <= 1) {
            return 2;
        }
        int prime = num;
        boolean found = false;
        while (!found) {
            prime++;
            if (primeNumbers.isPrime(prime)) {
                found = true;
            }
        }
        return prime;
    }
}
