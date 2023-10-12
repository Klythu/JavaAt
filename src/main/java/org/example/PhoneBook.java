package org.example;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> contacts = new HashMap<>();

    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, String value) {
        if (contacts.containsKey(key)) {
            contacts.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            contacts.put(key, list);
        }
    }

    // Метод, который печатает список контактов
    public static void printBook() {
        Set<String> names=contacts.keySet();
        for (String name: names){
            StringBuilder out= new StringBuilder(name);
            for (String nums :contacts.get(name)){
                out.append(' ').append(nums);
            }
            System.out.println(out);
        }

    }
}