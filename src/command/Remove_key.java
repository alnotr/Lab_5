package command;

import personParameters.Person;
import work.Manager;

public class Remove_key extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Remove_key(Manager collection) {
        super(collection);
    }

    /**
     * remove an element from a collection by its key
     * @param id id is a key, person argument is null
     */
    @Override
    public void execute(String id, Person argument) {
        Manager.removeByKey(id);
    }
}
