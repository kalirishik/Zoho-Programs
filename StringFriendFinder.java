import java.util.*;

public class StringFriendFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> persons = new ArrayList<>();
        List<List<String>> allFriends = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String personName = sc.next();
            persons.add(personName);
            int noOfFriends = sc.nextInt();
            List<String> friends = new ArrayList<>();
            for (int j = 0; j < noOfFriends; j++) {
                friends.add(sc.next());
            }
            allFriends.add(friends);
        }
        Set<String> oldFriends = new HashSet<>(persons);
        LinkedHashSet<String> newFriends = new LinkedHashSet<>();
        for (List<String> friends : allFriends) {
            for (String f : friends) {
                if (!oldFriends.contains(f)) {
                    newFriends.add(f);
                }
            }
        }
        for (String f : newFriends) {
            System.out.print(f + " ");
        }
    }
}
