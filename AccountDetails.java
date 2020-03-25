import java.util.Scanner;

public class AccountDetails {
        public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        AccountDetails acc= new AccountDetails();
        Account1 acc1=acc.getAccountDetails();
        System.out.println("Enter amount to be withdrawn:");
        int amount=scanner.nextInt();
        int am=getWithdrawAmount(amount);
        acc1.withdraw(am);
    }
    public Account1 getAccountDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account id:");
        int accountId=scanner.nextInt();
        System.out.println("Enter account type:");
        String accountType = scanner.next();
        boolean balance=false;
        int accountBalance=0;
        while(!balance){
            System.out.println("Enter balance:");
            accountBalance = scanner.nextInt();
            if(accountBalance>0){
                balance=true;
            }
            else{
                System.out.println("Balance should be positive");
                balance=false;
            }
        }
        Account1 account=new Account1();
        account.setAccountid(accountId);
        account.setAccountType(accountType);
        account.setBalance(accountBalance);
        return account;
    }
    public static int getWithdrawAmount(int amount1){
        boolean amount=false;
        while(!amount){
            if(amount1>0){
                amount=true;
            }
            else{
                System.out.println("Amount should be positive");
                amount=false;
                System.exit(1);
            }
        }
        return amount1;
    }
}
