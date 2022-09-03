package command;

import personParameters.Person;
import work.Manager;

import java.util.List;

public class Clear extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Clear(Manager collection) {
        super(collection);
    }

    /**
     * Remove all elements from collection
     * @param id id and person parametres are null
     */
    public void execute(String id, Person argument){
        List<Person> collection = Manager.getAllElements();
        if(collection.size() == 0){
            System.out.println("Коллекция пуста");
            return;
        }
        if(collection.size() != 0){
            System.out.println("Коллекция была удалена");
            Manager.clear();
        }
    }
}
