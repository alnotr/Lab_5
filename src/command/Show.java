package command;

import personParameters.Person;
import work.Manager;

import java.util.List;
import java.util.Map;

public class Show extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Show(Manager collection) {
        super(collection);
    }

    /**
     *print all elements of the collection in string representation
     * @param id id is and person argument are null
     */
    @Override
    public void execute(String id, Person argument) {
        List<Person> collection = Manager.getAllElements();
        if(collection.size() == 0){
            System.out.println("Коллекция пуста");
            return;
        }
        for(Map.Entry<String,Person> entry: Manager.entrySet()){
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
    }

}
