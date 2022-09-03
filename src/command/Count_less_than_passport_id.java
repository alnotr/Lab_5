package command;

import personParameters.Person;
import work.Manager;

import java.util.Map;

public class Count_less_than_passport_id extends AbstractCommand{
    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Count_less_than_passport_id(Manager collection) {
        super(collection);
    }

    /**
     * display the number of elements whose passportID field value is less than the given one
     * @param id - passportID from console or script
     */
    @Override
    public void execute(String id, Person argument) {
        int count = 0;
        int n = Integer.valueOf(id);
        for(Map.Entry<String,Person> entry : Manager.entrySet()) {
            String passport = entry.getValue().getPassportID();
            if(n > Integer.valueOf(passport)){
                count += 1;
            }
        }
        System.out.println("Количество элементов, у которых passportId меньше заданного : " + count);
    }
}
