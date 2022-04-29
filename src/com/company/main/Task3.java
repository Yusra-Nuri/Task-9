package com.company.main;

public class Task3 {
   public static void main(String[] args){
        Account account1 = new Account("Yusra Nuri", 10000, 56870);

        try{
            account1.withdrawal(100);
        }
        catch(NotEnoughMoneyException ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
        catch(Exception ex){

        }
        finally{
            System.out.println(account1.getBalance());
        }
   }
}
class Account{
   private String owner;
   private int Balance;
   private int accountNumber;

   public Account(String owner, int Balance, int accountNumber){
       this.owner = owner;
       this.Balance = Balance;
       this.accountNumber = accountNumber;
   }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void withdrawal(int amount) throws NotEnoughMoneyException{
       if(Balance >= amount){
           Balance = Balance - amount;
       }
       else{
           System.out.println("There's not enough money in the account, uc");
           throw new NotEnoughMoneyException("There's not enough money in the account, uc");
       }
    }
}
class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException (String message){
        super(message);
    }

}