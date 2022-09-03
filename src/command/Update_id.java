package command;

import personParameters.Person;
import work.Manager;

import java.util.Map;

public class Update_id extends AbstractCommand {
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Update_id(Manager collection) {
        super(collection);
    }

    /**
     *update the value of the collection element whose id is equal to the given one
     *  @param id id is a key, person argument - new parameters
     */
    @Override
    public void execute(String id, Person argument) {
        boolean flag = true;
        for(Map.Entry<String,Person> entry: Manager.entrySet()){
            if(entry.getValue().getId() == Long.valueOf(id)){
                Manager.add(entry.getKey(),argument);
                flag = false;
                System.out.println("Элемент был изменен");
                break;
            }
        }
        if(flag){
            System.out.println("Элемента с таким id нет");
        }
    }
}
