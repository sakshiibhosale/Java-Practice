import java.util.Scanner;

class OnlineBank {
    private String name;
    private int balance;

    // Constructor
    OnlineBank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw method
    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed account details
        OnlineBank acc = new OnlineBank("Ajay", 70000);

        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    int dep = sc.nextInt();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    int wd = sc.nextInt();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}