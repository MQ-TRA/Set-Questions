import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

class EventSecurity {
    private HashSet<String> vipList = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));

    /**
     * TO-DO: Check if the attendee list contains anyone NOT in the vipList.
     * \*
     *
     * @param attendees A list of names to check.
     * @return true if a non-VIP is found, false if all attendees are VIPs.
     */


    public boolean containsNonVip(List<String> attendees) {

        for (String s : attendees) {
            if (vipList.contains(s))
                return false;// Your code here. Iterate through the attendees and check against the vipList.
        }
        return true; // Placeholder

    }


    public static void main(String[] args) {
        EventSecurity ob = new EventSecurity();

        System.out.println(ob.containsNonVip(Arrays.asList("Bob", "jamal", "LT:ghost")));
    }
}