package command;

import personParameters.Person;
import work.Manager;

public class Exit extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Exit(Manager collection) {
        super(collection);
    }

    /**
     * command to stop the program
     * @param id id and person element are null
     */
    @Override
    public void execute(String id, Person argument) {
        System.out.println("Спасибо за использование приложения");
    }
}
