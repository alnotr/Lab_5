package work;

import command.*;
import exceptions.InputScriptException;
import personParameters.*;

import java.io.File;
import java.util.Scanner;

public class Validator {
    private static Scanner scanner;
    private String name;
    private int height;
    private Double weight;
    private String passportID;
    private Color eyeColor;
    private long x;
    private Long y;
    private Float locationX;
    private int locationY;
    private Long locationZ;
    private java.time.LocalDateTime creationDate;

    /**
     * Method to assign a new scanner
     * @param scanner
     */
    public static void setScanner(Scanner scanner) {
        Validator.scanner = scanner;
    }

    /**
     * Method to check a command from console or file
     * @param command
     * @param argument
     * @return boolean
     */
    public boolean validateArgument(AbstractCommand command, String argument){
        try{
            if (command instanceof Execute_script) {
                File file = new File(argument);
                return file.exists() && file.canRead();
           }

            if (command instanceof Insert || command instanceof Update_id || command instanceof Remove_key
            || command instanceof Remove_all_by_eye_color || command instanceof Replace_if_lower ||
                    command instanceof Replace_if_greater || command instanceof Remove_lower_key) {
                return argument != null;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check person's parameters from console
     * @return Person
     */
    public Person validateElementFromConsole(){
        System.out.println("Введите имя");
        while(true) {
            try {
                name = scanner.nextLine();
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите координату х");
        while(true) {
            try {
                x = Long.valueOf(scanner.nextLine());
                while (Math.abs(x) > 407) {
                    System.out.println("Неверный ввод, попробуйте еще");
                    x = Long.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите координату y");
        while(true) {
            try {
                y = Long.valueOf(scanner.nextLine());
                while (Math.abs(y) > 228) {
                    System.out.println("Неверный ввод, попробуйте снова");
                    y = Long.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите рост");
        while(true) {
            try {
                height = Integer.valueOf(scanner.nextLine());
                while(Math.abs(height) <= 0){
                    System.out.println("Неверный ввод, попробуйте еще");
                    height = Integer.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите вес");
        while(true) {
            try {
                weight = Double.valueOf(scanner.nextLine());
                while(Math.abs(weight) <= 0){
                    System.out.println("Неверный ввод, попробуйте еще");
                    weight = Double.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите паспортные данные");
        while(true) {
            try {
                passportID = scanner.nextLine();
                if(passportID == ""){
                    passportID=null;
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите цвет глаз");
        while(true) {
            try {
                for (Color c : Color.values()) {
                    System.out.println(c);
                }
                String str = scanner.nextLine();
                if(str == ""){
                    eyeColor = null;
                }else {
                    eyeColor = Color.valueOf(str);
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }

        System.out.println("Введите координату x локации");
        while(true) {
            try {
                locationX = Float.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }

        System.out.println("Введите координату y локации");
        while(true) {
            try {
                locationY = Integer.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }

        System.out.println("Введите координату z локации");
        while(true) {
            try {
                locationZ = Long.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        return new Person(name, new Coordinates(x, y), height, weight,
                passportID, eyeColor, new Location(locationX, locationY, locationZ));
    }

    public Person specialValidator(){
        System.out.println("Введите имя");
        while(true) {
            try {
                name = scanner.nextLine();
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите координату х");
        while(true) {
            try {
                x = Long.valueOf(scanner.nextLine());
                while (Math.abs(x) > 407) {
                    System.out.println("Неверный ввод, попробуйте еще");
                    x = Long.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите координату y");
        while(true) {
            try {
                y = Long.valueOf(scanner.nextLine());
                while (Math.abs(y) > 228) {
                    System.out.println("Неверный ввод, попробуйте снова");
                    y = Long.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите рост");
        while(true) {
            try {
                height = Integer.valueOf(scanner.nextLine());
                while(Math.abs(height) <= 0){
                    System.out.println("Неверный ввод, попробуйте еще");
                    height = Integer.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите вес");
        while(true) {
            try {
                weight = Double.valueOf(scanner.nextLine());
                while(Math.abs(weight) <= 0){
                    System.out.println("Неверный ввод, попробуйте еще");
                    weight = Double.valueOf(scanner.nextLine());
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        System.out.println("Введите паспортные данные");
        while(true) {
            try {
                passportID = scanner.nextLine();
                if(passportID == ""){
                    passportID=null;
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        eyeColor = Color.randomColor();

        System.out.println("Введите координату x локации");
        while(true) {
            try {
                locationX = Float.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }

        System.out.println("Введите координату y локации");
        while(true) {
            try {
                locationY = Integer.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }

        System.out.println("Введите координату z локации");
        while(true) {
            try {
                locationZ = Long.valueOf(scanner.nextLine());;
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Неверный ввод, попробуйте еще");
            }
        }
        return new Person(name, new Coordinates(x, y), height, weight,
                passportID, eyeColor, new Location(locationX, locationY, locationZ));
    }

    /**
     * Check person's parameters from script
     * @return Person
     */
    public Person validateElementFromScript() {
        try {
            String name = next(true);
            if (name.equals("")) {
                throw new InputScriptException();
            }
            long x = Long.parseLong(next(true));
            if (x > 407) {
                throw new InputScriptException();
            }
            long y = Long.parseLong(next(true));
            if (y > 228) {
                throw new InputScriptException();
            }
            int height = Integer.parseInt(next(true));
            if (height <= 0) {
                throw new InputScriptException();
            }
            double weight = Double.parseDouble(next(true));
            if (weight <= 0) {
                throw new InputScriptException();
            }
            String passportId = next(true);
            if (passportId.equals("")) {
                throw new InputScriptException();
            }
            Color color = Color.valueOf(next(true));
            String strX = next(true);
            if(strX.equals("")){
                throw new InputScriptException();
            }else{
                locationX = Float.valueOf(strX);
            }
            String strY = next(true);
            if(strY.equals("")){
                throw new InputScriptException();
            }else{
                locationY = Integer.valueOf(strY);
            }
            String strZ = next(true);
            if(strZ.equals("")){
                throw new InputScriptException();
            }else{
                locationZ = Long.valueOf(strZ);
            }
            return new Person(name, new Coordinates(x, y),creationDate, height, weight, passportId, color,
                    new Location(locationX, locationY, locationZ));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Method to read a script line by line
     * @param readFromFileStatus
     * @return String
     * @throws InputScriptException
     */
    private String next(boolean readFromFileStatus) throws InputScriptException {
        if (!readFromFileStatus) {
            return scanner.next();
        } else {
            if (scanner.hasNext()) {
                return scanner.next();
            } else {
                throw new InputScriptException();
            }
        }
    }
}
