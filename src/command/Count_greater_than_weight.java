package command;

import personParameters.Person;
import work.Manager;

import java.util.Map;

public class Count_greater_than_weight extends AbstractCommand{

    /**
     * Class constructor
     *
     * @param collection class for work with collection
     */
    public Count_greater_than_weight(Manager collection) {
        super(collection);
    }

    /**
     * Display the number of elements whose weight field value is greater than the given one
     * @param id - weight from console or script
     */
    @Override
    public void execute(String id, Person argument) {
        int count = 0;
        double newWeight = Double.valueOf(id);
        for(Map.Entry<String,Person> entry : Manager.entrySet()) {
            Person p = entry.getValue();
            double weight = Double.valueOf(p.getWeight());
            if(newWeight < weight){
                count += 1;
            }
        }
        System.out.println("Количество элементов, вес которых больше заданного : " + count);
    }
}
