import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {
    private static BankApplication bankApp;

    public static void main(String[] args) {

        bankApp = new BankApplication();


        processWrapper("accountId000", 50, "USD");
        processWrapper("accountId003", 250, "HRV");
        processWrapper("accountId001", 50, "EUR");
        processWrapper("accountId001", 50, "USD");
        processWrapper("accountId001", 2000, "USD");
    }

    public static void processWrapper(String accountId, int amount, String currency) {
        try {
            if (bankApp != null) {
                bankApp.process(accountId, amount, currency);
            } else {
                System.out.println("BankApplication object is not initialized.");
            }
        } catch (WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}