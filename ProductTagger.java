import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ProductTagger {
    public static void main(String[] args) {
        /**
         * TO-DO: Check if 'setA' is a subset of 'setB'.
         * For example, if setA is {"electronics", "sale"} and setB is {"electronics", "sale", "new"},
         * then the method should return true.
         \*
         * @param setA The potential subset.
         * @param setB The potential superset.
         * @return true if all elements of setA are in setB, false otherwise.
         */
        //public boolean isSubset (Set < String > setA, Set < String > setB){
        HashSet<String> SetA = new HashSet<>(Arrays.asList("electronics", "sale"));
        HashSet<String> SetB = new HashSet<>(Arrays.asList("electronics", "sale", "new"));
        //Set<String> union = new HashSet<>(SetA);
        //union.addAll(SetB);
        System.out.println("All sets: \nA: " + SetA + "\nB: " + SetB);

        Set<String> checker = new HashSet<>(SetB);

        checker.retainAll(SetA);
        System.out.println(checker);

        if (checker.equals(SetA)) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
