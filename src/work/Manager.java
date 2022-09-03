package work;

import personParameters.Person;

import java.time.LocalDateTime;
import java.util.*;


public class Manager implements ManagerInterface{
    private static TreeMap<String, Person> collection = new TreeMap<String, Person>() ;
    private static final LocalDateTime initTime = LocalDateTime.now();


    /**
     * Add a new person to collection
     */
    public static void add(String id, Person element) {
        collection.put(id, element);
    }

    /**
     * Return all elements as a list
     * @return ArrayList<></>
     */
    public static List<Person> getAllElements() {
        return new ArrayList<>(collection.values());
    }

    /**
     * Remove all elements
     */
    public static void clear(){
        collection.clear();
    }

    /**
     * Make a set with elements from map key+value
     * @return Set
     */
    public static Set<Map.Entry<String, Person>> entrySet(){
        return collection.entrySet();
    }

    /**
     * Return a person by key
     * @return Person
     */
    public static Person get(String id){
        return collection.get(id);
    }

    /**
     * Remove a person by key
     */
    public static void removeByKey(String key){
        collection.remove(key);
    }

    /**
     * Change person's parameters by id.
     */
    public static void changeValueById(String id, Person person) {
        collection.put(id, person);
    }

    /**
     * Return date and time of collection creation
     * @return LocalDateTime
     */
    public static LocalDateTime getInitTime() {
        return initTime;
    }

    /**
     * Return a number of elements in the collection
     * @return int
     */
    public static int size() {
        return collection.size();
    }
}

