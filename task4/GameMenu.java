import java.util.ArrayList;

public class GameMenu {
    // 4.d - actions attribute of type ArrayList<String>
    private ArrayList<String> actions;
    
    // 4.c - constructor with parameter type arraylist
    public GameMenu(ArrayList<String> actions){
        // 4.e - list received as an argument to actions instance
        this.actions = actions;
    }
    
    // 4.h - method displayMenu()
    public void displayMenu(){
        for(String gm: actions){
            System.out.println(gm);
        }
    }
}