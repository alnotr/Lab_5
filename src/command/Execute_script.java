package command;

import personParameters.Person;
import work.Manager;

public class Execute_script extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Execute_script(Manager collection) {
        super(collection);
    }

    /**
     * command to read and execute commands from scripts
     * @param id id and person element are null
     */
    @Override
    public void execute(String id, Person element) {
    }
}
