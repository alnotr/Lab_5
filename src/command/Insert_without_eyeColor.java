package command;

import personParameters.Person;
import work.Manager;

public class Insert_without_eyeColor extends AbstractCommand{
    /**
     * @param collection collection
     */
    public Insert_without_eyeColor(Manager collection) {
        super(collection);
    }
    public void execute(String id, Person argument) {
        Manager.add(id, argument);
    }
}
