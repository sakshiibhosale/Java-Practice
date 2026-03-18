package Encapsulation;

class BankAccount {

    private int accountNumber;
    private double balance;

    
    public void setBalance(double amount) {
        balance = balance + amount;
    }

    
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setBalance(5000);   
        b1.setBalance(2000);   

        System.out.println("Account Balance: " + b1.getBalance());
    }
}