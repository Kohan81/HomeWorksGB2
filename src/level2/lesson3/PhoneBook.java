package src.src.level2.lesson3;

import java.util.*;

public class PhoneBook {

    List<Person> phoneBookMap = new LinkedList<>();
    List<Person> personArrayList;

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "345_12_236");
        phoneBook.add("Smirnov", "654_24_338");
        phoneBook.add("Sidorov", "899_99_435");
        phoneBook.add("Dyatlov", "345_15_954");
        phoneBook.add("Tarasov", "754_949_26");
        phoneBook.add("Ivanov", "453_547_09");
        phoneBook.add("Ivanov", "743_04_00");
        phoneBook.add("Varlamov", "356_99_92");
        phoneBook.add("Jdanov", "157_52_095");
        phoneBook.add("Zalyujny", "444_03_02");
        phoneBook.add("Smirnov", "200_03_00");
        phoneBook.add("Gryzlov", "388_465_19");
        phoneBook.add("Sidorov", "113_69_542");
        phoneBook.add("Ivanov", "547_284_88");
        phoneBook.add("Petrenko", "245_56_141");

        phoneBook.personArrayList = phoneBook.get("Ivanov");
        phoneBook.personToString(phoneBook.personArrayList);
        phoneBook.personArrayList = phoneBook.get("Petrov");
        phoneBook.personToString(phoneBook.personArrayList);
        phoneBook.personArrayList = phoneBook.get("Gryzlov");
        phoneBook.personToString(phoneBook.personArrayList);
        phoneBook.personArrayList = phoneBook.get("Smirnov");
        phoneBook.personToString(phoneBook.personArrayList);
    }

    void add(String name, String phoneNumber){
        Person person = new Person(name, phoneNumber);
        phoneBookMap.add(person);
    }

    List get(String name){
        List<Person> result = new ArrayList<>();
        for (Person person : phoneBookMap ) {
            if ((person.name.equals(name))){
                result.add(person);
            }
        }
        return result;
    }

    void personToString(List<Person> list){
        for (Person person: list) {
            System.out.println(person.toString());
        }
    }

}