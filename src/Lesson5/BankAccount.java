package Lesson5;

public class BankAccount {
    int id = 10;
    String name = "Geraklit";
    double balance = 5000;


    void popolnenieScheta(double summaPopolnenya) {
        System.out.println("Balans do popolnenya: " + balance);
        System.out.println("Balans popolnyaetsya na: " + summaPopolnenya);
        balance += summaPopolnenya;
        System.out.println("Balans posle popolneniya: " + balance);
        System.out.println();
            }
    void snyatiSoScheta(double summaSnyatiya) {
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Balans umenshaetsya na: " + summaSnyatiya);
        balance -=summaSnyatiya;
        System.out.println("Balans posle snyatiya: " + balance);
        System.out.println();
    }
}
    class BankAccountTest{
        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();

            MyAccount.popolnenieScheta(500);
            MyAccount.snyatiSoScheta(300);
        }

    }

