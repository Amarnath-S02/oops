import java.util.Scanner;

class Bankingsystem {
    private String name;
    private String AccountNo;
    private double balance;

    public Bankingsystem() {
        this.name = null;
        this.AccountNo = null;
        this.balance = 0;
    }

    public Bankingsystem(String name, String Accountno, double balance) {
        this.name = name;
        this.AccountNo = Accountno;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNu(String accountNu) {
        AccountNo = accountNu;
    }

    public String getAccountNu() {
        return AccountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " amount is deposited");
        } else {
            System.out.println("ivalid amount");

        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance > amount) {
            balance -= amount;
            System.out.println("your balance is " + balance + " after withdrawed " + amount);
        } else {
            System.out.println("insufficent balance");

        }
    }
}


class encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter Account Number:");
        String Accountno = sc.nextLine();

        System.out.println("Enter your balance:");
        double balance = sc.nextDouble();

        Bankingsystem user = new Bankingsystem(name, Accountno, balance);


        System.out.println("Welcome, " + user.getName() + "!");
        System.out.println("Initial balance: " + user.getBalance());
        char cont;


        do {

            System.out.println("Enter the option:");

            System.out.println("1)Deposit 2)Withdraw 3)Check Balance ");

            int option = sc.nextInt();

            if (option == 1)
            {
                System.out.println("enter deposit Amount:");
                double amount = sc.nextDouble();
                user.Deposit(amount);
            }

            else if (option == 2) {
                System.out.println("enter Withdraw amount:");
                double withdraw = sc.nextDouble();
                user.withdraw(withdraw);
            }

            else if(option==3){
                System.out.println("your balance:"+ user.getBalance());
            }

            else {
                System.out.println("invalid");
            }

            System.out.println("Do you want to  continue? enter Y or N");
             cont = sc.next().charAt(0);

        } while(cont=='Y' || cont=='y');

        System.out.println("Thank you for using our banking system.");
        sc.close();

    }
}

