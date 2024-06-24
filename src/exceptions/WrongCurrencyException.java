package exceptions;

public class WrongCurrencyException extends Throwable {
    public WrongCurrencyException() {
        super("Акаунт має рахунок в іншій валюті");

    }
}
