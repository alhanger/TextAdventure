import java.util.ArrayList;

/**
 * Created by alhanger on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName() { //Player chooses Name
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println(String.format("Good luck, %s", name));
    }

    void chooseWeapon() throws Exception { //Player chooses Weapon
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a club");
        System.out.println("[3] Pick up some bitches");
        weapon = Game.nextLine();
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
    }

    void chooseArea() throws Exception { //Player picks an Area to travel to
        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the tunnel");
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering the tunnel... Watch your head!");
        } else {
            throw new Exception("You can't go there!");
        }
    }

    void findItem(String item) {
        System.out.println("Found item. Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println(String.format("You found a %s", item));
            items.add(item);
        }
    }
}
