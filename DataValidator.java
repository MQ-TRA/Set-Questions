import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DataValidator {
    public static void main(String[] args) {

        /**
         * TO-DO: Efficiently check for duplicates in an array using a HashSet.
         * The method should stop and return true as soon as the first duplicate is found.
         \*
         * @param items The array of strings to check.
         * @return true if duplicates exist, false otherwise.
         */

        HashSet<String> items = new HashSet<>(Arrays.asList("user1", "user2", "user3"));
        System.out.println("The current users list contains: " + items);
        System.out.println("Checking the validity by adding an exiting user 'user1' to the list. The result is: " + items.add("user1"));
    }
}
//public boolean hasDuplicates(String[] items) {
//Set<String> seenItems = new HashSet<>();


// Your code here. Use the return value of set.add() to detect a duplicate.


// return false; // Placeholder


//}
//}