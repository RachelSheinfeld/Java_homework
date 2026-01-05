package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Racheli", 18));
        list.add(new Person("Rivka", 19));

        Files.writeToFile(list, "out.csv");
    }
}