package activities;

        //Create a HasSet names hs.
        //Add 6 objects using add() method to the HashSet.
        //Then print the size of the HashSet using the size() method.
        //Remove an element using the remove() method.
        //Also try to remove an element that is not present in the Set.
        //Use the contains() method to check if an item is in the Set or not.
        //Print the updated set.

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        // Adding objects to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Mango");
        hs.add("Grapes");
        hs.add("Watermelon");

        // Printing the size of the HashSet
        System.out.println("Size of hs: " + hs.size());

        // Removing an element from the HashSet
        boolean removed = hs.remove("Banana");
        System.out.println("Element 'Banana' removed? " + removed);

        // Trying to remove an element that is not present in the HashSet
        removed = hs.remove("Strawberry");
        System.out.println("Element 'Strawberry' removed? " + removed);

        // Checking if an item is in the Set using contains() method
        String searchItem = "Mango";
        boolean containsItem = hs.contains(searchItem);
        System.out.println("Does hs contain '" + searchItem + "'? " + containsItem);

        // Printing the updated HashSet
        System.out.println("Updated hs: " + hs);
    }
}