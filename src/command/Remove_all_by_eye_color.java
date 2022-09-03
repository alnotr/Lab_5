package command;

import personParameters.Color;
import personParameters.Person;
import work.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Remove_all_by_eye_color extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Remove_all_by_eye_color(Manager collection) {
        super(collection);
    }

    /**
     * remove from the collection all elements whose eyeColor field value is equivalent to the given one
     * @param id is EyeColor
     */
    @Override
    public void execute(String id, Person argument) {
        int count = 0;
        Color color = Color.valueOf(id);
        List<String> toRemove = new ArrayList<>();
        for(Map.Entry<String,Person> entry : Manager.entrySet()) {
            Person p = entry.getValue();
            String key = entry.getKey();
            Enum EyeColor = p.getEyeColor();
            if(color.equals(EyeColor)){
                toRemove.add(key);
            }
        }
        for(int i = 0; i<toRemove.size(); i++){
            Manager.removeByKey(toRemove.get(i));
            count += 1;
        }
        System.out.println("Было удалено следующее количество элементов : " + count);
    }

}
