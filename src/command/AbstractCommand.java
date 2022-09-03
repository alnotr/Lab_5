package command;
import personParameters.Person;
import work.Manager;

public abstract class AbstractCommand implements CommandInterface{
    final Manager manager;

    /**
     *
     * @param collection collection
     */
    public AbstractCommand(Manager collection) {
        manager = collection;
    }

    /**
     * Executing the command
     * @param id id and person parametres for our command
     */
    public void execute(String id, Person argument) {}

}
