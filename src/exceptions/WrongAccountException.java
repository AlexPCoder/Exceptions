package exceptions;

public class WrongAccountException extends Throwable {
    public WrongAccountException() {
        super("Такого акаунту не існує");
}
}
