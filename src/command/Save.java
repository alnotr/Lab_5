package command;

import personParameters.Person;
import work.Manager;
import work.Saver;

public class Save extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Save(Manager collection) {
        super(collection);
    }

    /**
     * save collection into other.xml
     */
    @Override
    public void execute(String id, Person argument) {
        Saver.start(Manager.entrySet());
    }
}

