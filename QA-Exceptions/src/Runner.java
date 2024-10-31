import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100);

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("How much would you like to withdraw?");
            double amount = scanner.nextDouble();
            account1.withdraw(amount);
        }
        catch (InsufficientFundsException e){
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Withdrawal process finished, Goodbye");
        }

    }
}
