import java.util.ArrayList;

//4.e - client class Main
public class Main{
   public static void main(String[]args){
   //4.f- create an ArrayList<String> called actions
     ArrayList<String> actions = new ArrayList<>();
       //String values added:
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

       // System.out.println(actions.get(2)); // expected output: "3) Pause game"

    //4.g - instantiate GameMenu class with actions list as an argument
    GameMenu gm = new GameMenu(actions);
    
    //4.i - test the displayMenu() method by calling it on the GameMenu instance
     gm.displayMenu();
   }
  


}