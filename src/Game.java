import java.util.Scanner;

/**
 * Created by alhanger on 10/8/15.
 */
public class Game {
    static Player player;
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Westeros!");
        player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
        player.findItem("Shield");

        Weapon ogreWeapon = new Weapon();
        ogreWeapon.name = "Club";
        ogreWeapon.damage = 5;
        Enemy ogre = new Enemy("Ogre", 50, 5, ogreWeapon);
        player.battle(ogre);
    }

    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")) {
            if (s.equals("/help")) {
                System.out.println("These are the available commands:");
                System.out.println("/help => Lists available commands.");
            } else if (s.equals("/exit")) {
                System.exit(0);
            } else if (s.equals("/inv")) {
                if (player.items.size() == 0) {
                    System.out.println("Your bag is empty.");
                }
                for (Object item : player.items) {
                    System.out.println(item);
                }
            }
            return nextLine();
        } else {
            return s;
        }
    }
}
