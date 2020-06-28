package ru.geekbrains.home_work_1_2_3;

import java.util.*;


public class Phonebook {


    public HashMap<String, ArrayList<String>> phoneBook  = new HashMap<>();

    public void add (String surname, String phoneNumber ){


        List<String> phones = phoneBook.get(surname);
        if (phones == null){
            phoneBook.put(surname, new ArrayList<>());
           }
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get (String surname){
        List<String> phones = phoneBook.get(surname);
        if (phones == null){
            return List.of();
        }
        return phones;
    }






/*    phonebook.put("Иванов", "+7 999 999 99 99");
        phonebook.put( "Петров", "+7 888 888 88 880");
        *//*Map<String, ArrayList<String >> pb = new HashMap<>();
        pb.put("Иванов", "111 11 11 110");*/

/*       if(itemsList == null) {
        st<Item>();
        itemsList.add(myItem);
        items.put(mapKey, itemsList);
    } else {
        // add if item is not already in list
        if(!itemsList.contains(myItem)) itemsList.add(myItem);*/














/*    public  void add (String surname, String phoneNumber) {

        if(itemsList == null) {
            itemsList = new ArrayList<Item>();
            itemsList.add(myItem);
            items.put(mapKey, itemsList);

    }*/





/*ArrayList<Item> al = new ArrayList<Item>();
Items.add("theKey", al);
Items.get("theKey").add(item)*/

}







