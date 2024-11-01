import java.util.Scanner;

public class bank {
    String account_holder;
    int account_number;
    int account_balance=0;

    Scanner input = new Scanner(System.in);

        public void deposit() {
            System.out.print("Enter an amount to deposit: ");
            int deposit_amount = input.nextInt();
            input.nextLine();

            if (deposit_amount > 0){
                System.out.print("Are you sure you want to deposit this amount into your account? (Yes/No): ");
                String question = input.nextLine();
                if (question.equals("Yes")){
                    this.account_balance+=deposit_amount;
                    System.out.printf("You have deposited %d into your account", deposit_amount);
                }
                else{
                    System.out.println("Transaction failed");
                }
            }
            else{
                System.out.println("Invalid Input");
            }

            input.close();

        }

        public void withdraw() {
            System.out.print("Enter an amount to withdraw: ");
            int amount = input.nextInt();
            input.nextLine();

            if (amount > 0){
                System.out.print("Are you sure you want to withdraw this amount (Yes/No): ");
                String question = input.nextLine();
                if (question.equals("Yes")){
                    if (amount <= this.account_balance){
                        this.account_balance -= amount;
                        System.out.printf("You have withdrawn %d from your account", amount);
                    }
                    else{
                        System.out.println("Insufficient funds");
                    }
                }
                else{
                    System.out.println("Transaction failed");
                }
            }
            else{
                System.out.print("Cannot withdraw amount");
            }

            input.close();
        }

        public void display_details(){
            System.out.printf(" Account number: %d \n Account name: %s \n Account Balance: %d ", account_number, account_holder, account_balance);
        }

        public void check_balance(){
            System.out.printf(" Your current balance: %d", account_balance);
        }
}
