package command;

import personParameters.Person;
import work.Manager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Remove_lower_key extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Remove_lower_key(Manager collection) {
        super(collection);
    }

    /**
     * remove from the collection all elements whose key is less than the given one
     * @param id id is a key, person argument is null
     */
    @Override
    public void execute(String id, Person argument) {
        int count = 0;
        Set<Map.Entry<String,Person>> entrySet = new HashSet<>(Manager.entrySet());
        for(Map.Entry<String,Person> entry : entrySet) {
            String key = entry.getKey();
            if( Integer.valueOf(id)>Integer.valueOf(key)){
                Manager.removeByKey(key);
                count += 1;
            }
        }
        System.out.println("Было удалено следующее количество элементов : " + count);
    }
}
