package exceptions;


public class WrongOperationException extends Throwable {
    public WrongOperationException() {
        super("Акаунт не має достатньо коштів");

    }
}