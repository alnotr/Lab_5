package command;

import personParameters.Person;

public interface CommandInterface {
    void execute(String id, Person argument);
}
