import java.security.PublicKey;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Mark");
        users.add("Jake");
        users.add("Axwell");
        iterateUsers(users);

        sayHello("hello my name is shedrack abel");

        List<String> hamasMembers = new ArrayList<>();
        hamasMembers.add("Abu Obedia");
        hamasMembers.add("Mosseb Yusuf Hasan");
        hamasMembers.add("Ben shapiro");
        hamasMembers.add("Tal broda");
        filterHamasTerrorist(hamasMembers);

        compareFruits("Orange");
    }

    public static void iterateUsers(List<String> users) {
        for (String user : users) {
            System.out.println("Users -> " + user);
        }
    }

    public static void sayHello(String message) {
        System.out.println("Message: " + message.toUpperCase());
    }

    public static void filterHamasTerrorist(List<String> terrorist) {
        for (String terrors : terrorist) {
            System.out.println("Hamas Terrorist -> " + terrors.toUpperCase());
        }
    }

    public static void compareFruits(String fruitName) {
        switch (fruitName) {
            case "Banana":
                System.out.println("Eat this fruit for sex");
                break;
            case "Apple":
                System.out.println("Eat this fruit for kidney");
                break;
            case "Watermelon":
                System.out.println("Eat this fruiy for general health");
                break;
            default:
                System.out.println("No fruit specify here please");
        }
    }
}