package command;

import personParameters.Person;
import work.Manager;

public class Info extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Info(Manager collection) {
        super(collection);
    }

    /**
     * Print information about collection(Type, data of init and count of objects).
     */
    @Override
    public void execute(String id, Person argument) {

        String s = "Тип этой коллекции - TreeMap"  + "\n" +
                "Date of init - " + Manager.getInitTime() + "\n" +
                "Count of object in Collection - " + Manager.size();
        System.out.println(s);
    }
}
