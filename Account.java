public class Account {

    private long accountNumber;
    private double balanceAmount;
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalanceAmount() {
        return balanceAmount;
    }
    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    public Account(long accountNumber, double balanceAccount){
        setAccountNumber(accountNumber);
        setBalanceAmount(balanceAccount);
    }
    public void deposit(double amountDeposit){
        setBalanceAmount(getBalanceAmount()+amountDeposit);
    }
    public int withdraw(double amountWithdraw){
        if(amountWithdraw>getBalanceAmount()){
            return -1;
        }
        else {
             return 1;
        }
    }
}
