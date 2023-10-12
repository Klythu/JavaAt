package org.example;



import java.util.*;

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
        Set<String> names = contacts.keySet();
        String[] count1=new String[names.size()];
        Integer[] count2=new  Integer[names.size()];
        int i=0;
        for (String name:names){
            count1[i]=name;
            count2[i]=contacts.get(name).size();
            i++;
        }

        for (int j = 0; j < count2.length; j++) {
            for (int k = 0; k < count2.length-1; k++) {
                if (count2[k]<count2[k+1]){
                    int tmp=count2[k];
                    String txt= count1[k];
                    count2[k]=count2[k+1];
                    count1[k]=count1[k+1];
                    count2[k+1]=tmp;
                    count1[k+1]=txt;
                }
            }
        }
        for (String name: count1){
            StringBuilder out= new StringBuilder(name);
            for (String nums :contacts.get(name)){
                out.append(' ').append(nums);
            }
            System.out.println(out);
        }

    }
}