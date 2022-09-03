package command;

import personParameters.Person;
import work.Manager;

public class Insert extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Insert(Manager collection) {
        super(collection);
    }

    /**
     * add a new person to the collection
     * @param id id and person argument of a new person from console or script
     */
    public void execute(String id, Person argument) {
        Manager.add(id, argument);
    }
}
