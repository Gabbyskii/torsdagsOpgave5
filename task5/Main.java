import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 4.f – create an ArrayList<String> called actions
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // 4.g – instantiate GameMenu class with actions list as an argument
        GameMenu gm = new GameMenu(actions);

        // 4.i – test the displayMenu() method by calling it on the GameMenu instance
        gm.displayMenu();

        // 5.d – call the promptUser() method on the GameMenu instance
        String userChoice = gm.promptUser();   // <── rettet her

        // 5.g – convert String to int in doAction() method
        int choice = Integer.parseInt(userChoice);
        doAction(choice);
    }

    // 5.e – create new method for printing message that corresponds to user's chosen action
    public static void doAction(int action) {
        // 5.f – switch-case with a case for each of the 4 options
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
        }
    }
}
