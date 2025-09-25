import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    // 4.d – actions attribute of type ArrayList<String>
    private ArrayList<String> actions;

    // 4.c – constructor with parameter type ArrayList
    public GameMenu(ArrayList<String> actions) {
        // 4.e – list received as an argument to actions instance
        this.actions = actions;
    }

    // 4.h – method displayMenu()
    public void displayMenu() {
        /*for (String gm : actions) {
            System.out.println(gm);
        }*/
    }

    // 5.a – method promptUser()
    public String promptUser() {
        System.out.println("Type a number to choose an action: ");
        for (String gm : actions) {
            System.out.println (gm);
        }

        // 5.b – scanner object
        Scanner scan = new Scanner(System.in);

        // 5.c – declare String 
        String userChoice = scan.nextLine();

        return userChoice;
    }
}
