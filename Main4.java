import java.util.Scanner;

public class Main4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number:");
        long accountNumber = scanner.nextLong();
        System.out.println("Enter the available amount in the account:");
        int availableBalance = scanner.nextInt();
        System.out.println("Enter the amount to be deposited:");
        int amountDeposited = scanner.nextInt();
        Account account = new Account(accountNumber, availableBalance);
        account.deposit(amountDeposited);
        System.out.println("Available balance is:" + String.format("%.2f",account.getBalanceAmount()));
        System.out.println("Enter the amount to be withdrawn:");
        int amountWithdraw = scanner.nextInt();
        int i = account.withdraw(amountWithdraw);
        if (i < 0) {
            System.out.println("Insufficient balance");
            System.out.println("Available balance is:" + String.format("%.2f",(account.getBalanceAmount())));
        } else {
            System.out.println("Available balance is:" + String.format("%.2f",(account.getBalanceAmount() - amountWithdraw)));
        }
    }
}
