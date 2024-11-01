public class test {

    public static void main(String[] args){
        bank user = new bank();
        user.account_holder = "Nana";
        user.account_number = 12345;

        user.deposit();
        user.withdraw();
        user.check_balance();
        user.display_details();
        

    }
   
}
