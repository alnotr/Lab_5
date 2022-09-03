package personParameters;

import java.time.LocalDateTime;

public class Person implements Comparable<Person> {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private personParameters.Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int height; //Значение поля должно быть больше 0
    private Double weight; //Поле не может быть null, Значение поля должно быть больше 0
    private String passportID; //Строка не может быть пустой, Длина строки не должна быть больше 45, Поле может быть null
    private personParameters.Color eyeColor; //Поле может быть null
    private personParameters.Location location; //Поле не может быть null
    static long newId = 0;

    public Person(String name, personParameters.Coordinates coordinates, int height, Double weight, String passportID,
                  personParameters.Color eyeColor, personParameters.Location location) {
        creationDate = LocalDateTime.now().withNano(0);
        newId += 1;
        this.id = newId;
        this.name = name;
        this.coordinates = coordinates;
        this.height = height;
        this.weight = weight;
        this.passportID = passportID;
        this.eyeColor = eyeColor;
        this.location = location;
    }

    public Person(String name, personParameters.Coordinates coordinates, LocalDateTime dateTime, int height, Double weight, String passportID,
                  personParameters.Color eyeColor, personParameters.Location location) {
        newId += 1;
        this.id = newId;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = dateTime;
        this.height = height;
        this.weight = weight;
        this.passportID = passportID;
        this.eyeColor = eyeColor;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public int getHeight() {
        return height;
    }

    public Location getLocation() {
        return location;
    }

    public String getPassportID() {
        return passportID;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", height=" + height +
                ", weight=" + weight +
                ", passportID='" + passportID + '\'' +
                ", eyeColor=" + eyeColor +
                ", location=" + location +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return id.compareTo(person.getId());
    }
}


