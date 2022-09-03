package work;

import personParameters.Person;
import command.*;

import java.util.Map;
import java.util.HashMap;

public class Invoker {
    private final Manager collectionManager;
    private final Map<String, AbstractCommand> commands = new HashMap<>();
    private static final Validator validator = new Validator();

    /**
     * Class constructor
     *
     * @param manager class for work with collection
     */
    public Invoker(Manager manager) {
        collectionManager = manager;
        initMap();
    }

    /**
     * Method that fills the map with commands
     */
    public void initMap() {
        commands.put("info", new Info(collectionManager));
        commands.put("help", new Help(collectionManager));
        commands.put("show", new Show(collectionManager));
        commands.put("insert", new Insert(collectionManager));
        commands.put("update_id", new Update_id(collectionManager));
        commands.put("clear", new Clear(collectionManager));
        commands.put("exit", new Exit(collectionManager));
        commands.put("remove_key", new Remove_key(collectionManager));
        commands.put("replace_if_greater", new Replace_if_greater(collectionManager));
        commands.put("replace_if_lower", new Replace_if_lower(collectionManager));
        commands.put("remove_lower_key", new Remove_lower_key(collectionManager));
        commands.put("remove_all_by_eye_color", new Remove_all_by_eye_color(collectionManager));
        commands.put("count_less_than_passport_id", new Count_less_than_passport_id(collectionManager));
        commands.put("count_greater_than_weight", new Count_greater_than_weight(collectionManager));
        commands.put("save", new Save(collectionManager));
        commands.put("execute_script path", new Execute_script(collectionManager));
        commands.put("insert_without_eyeColor", new Insert_without_eyeColor(collectionManager));
    }

    /**
     * a method to check the situation and call the required validator method
     * @param newCommand
     * @param argument
     * @param readFromFileStatus
     */
    public void execute(String newCommand, String argument, boolean readFromFileStatus) {
        AbstractCommand command = commands.get(newCommand);
        if (command != null) {
            if (validator.validateArgument(command, argument)) {
                Person element = null;
                if(command instanceof Insert_without_eyeColor){
                    element = validator.specialValidator();
                }
                if (command instanceof Insert || command instanceof Update_id ||
                        command instanceof Replace_if_greater || command instanceof Replace_if_lower) {
                    if (!readFromFileStatus) {
                        element = validator.validateElementFromConsole();
                    } else {
                        element = validator.validateElementFromScript();
                        if (element == null) {
                            System.out.println("Неверные данные в скрипте");
                            return;
                        }
                    }
                }
                command.execute(argument, element);
            } else {
                System.out.println("Неверная команда, введите ключ");
            }
        } else {
            if (!readFromFileStatus) {
                System.out.println("Неверная команда, попробуйте снова или введите exit");
            }
        }
    }
}
