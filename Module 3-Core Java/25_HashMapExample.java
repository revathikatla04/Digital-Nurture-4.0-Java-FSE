import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Enter student ID and name (ID -1 to stop):");
        while (true) {
            int id = scanner.nextInt();
            if (id == -1) break;
            scanner.nextLine();
            String name = scanner.nextLine();
            map.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = scanner.nextInt();
        System.out.println("Name: " + map.getOrDefault(searchId, "Not found"));
    }
}
