public class Account1 {
    private int accountid;
    private String accountType;
    private int balance;

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount){
        if(amount<getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("Balance amount after withdraw:"+getBalance());
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}