package activities;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> mylist = new ArrayList<String>();

        //adding elements to array list
        mylist.add("Apple");
        mylist.add("Banana");
        mylist.add("Orange");
        mylist.add("Grapes");
        mylist.add("Kiwi");

        // Accessing elements in the ArrayList
        System.out.println("mylist details: " + mylist);
        for (String name : mylist) {
            System.out.println(name);
        }
        // Retrieving the third name from the ArrayList
        String thirdName = mylist.get(2);
        System.out.println("Third name in mylist: " + thirdName);

        // Checking if a name exists in the ArrayList
        String searchName = "Grapes";
        boolean containsName = mylist.contains(searchName);
        System.out.println("Does mylist contain \"" + searchName + "\"? " + containsName);

        // Printing the number of names in the ArrayList
        int numNames = mylist.size();
        System.out.println("Number of names in mylist: " + numNames);

        // Removing a name from the ArrayList
        String removeName = "Grapes";
        mylist.remove(removeName);

        // Printing the updated number of names in the ArrayList
        numNames = mylist.size();
        System.out.println("Number of names in mylist after removing \"" + removeName + "\": " + numNames);

    }

}


