package AccessModifiers;

public class AccountTester {
    public static void main(String[] args) {


        Account account = new Account();
      // private access -   account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}
