package exceptions;

public class InputScriptException extends Exception {
    public InputScriptException() {
        super("Неверные поля в скрипте");
    }
}
