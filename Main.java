import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        if(username.equals("admin") && password.equals("admin"))
        {
            System.out.println("You are logged in!");
            int deposit, withdrawal,balance=10000;
            while(true)
            {
                System.out.println("choose the amount to deposit: ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. balance Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        deposit = sc.nextInt();
                        System.out.println("My money successfully deposit RS."+deposit);
                        balance += deposit;
                        break;
                    case 2:
                        System.out.print("Enter money to be withdrawn:");
                        withdrawal = sc.nextInt();
                        if(balance>=withdrawal)
                        {
                            balance = balance-withdrawal;
                            System.out.println("You have been withdrawn RS."+withdrawal);
                        }
                        else
                        {
                            System.out.println("Insufficient balance");
                        }
                        break;
                    case 3:
                        System.out.println("Balance: "+balance);
                        break;
                    case 4:
                        System.exit(0);

                }

            }

        }
        else
        {
            System.out.println("You are not logged in!");
        }
    }
}
