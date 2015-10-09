import java.util.Scanner;

/**
 * Created by alhanger on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to Winterfell!");
        System.out.println("What is your name, traveler?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Good luck, " + name);

        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a club");
        System.out.println("[3] Pick up some bitches");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("That's a fine sword!");
        } else if (weaponNum == 2) {
            System.out.printf("That's an awfully heavy club.");
        } else if (weaponNum == 3) {
            System.out.println("I see your priorities are in proper order.");
        } else {
            throw new Exception("Invalid weapon.");
        }

        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the tunnel");
        String area = scanner.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering the tunnel... Watch your head!");
        } else {
            throw new Exception("You can't go there!");
        }
    }
}
