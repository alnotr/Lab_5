package command;

import personParameters.Person;
import work.Manager;

public class Replace_if_greater extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Replace_if_greater(Manager collection) {
        super(collection);
    }

    /**
     *replace value by key if new value is more than old
     * @param id id is a key, person argument is null
     */
    @Override
    public void execute(String id, Person argument) {
        Person oldperson = Manager.get(id);
        if(argument.compareTo(oldperson) > 0){
            Manager.changeValueById(id,argument);
            System.out.println("Элемент был заменен");
        }else{
            System.out.println("Элемент не был заменен");
        }
    }
}
