import java.util.HashSet;
//import java.util.List;
import java.util.Set;
import java.util.Arrays;

class UserManagement {
    private static Set<String> approvedUsers = new HashSet<>(Arrays.asList("a@test.com", "b@test.com", "c@test.com"));

    public static void main(String[] args) {

        System.out.println("Approved users are --> " + approvedUsers);
        removeUsers();
        System.out.println("All users were removed --> " + approvedUsers);

    }

    private static void removeUsers() {
        approvedUsers.removeAll(approvedUsers);
    }
}