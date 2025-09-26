import java.util.ArrayList;

//1.a Main class with main method
class Main{
  public static void main(String[] args) {
  
  //1.g - instance of the team class 
  	Team t = new Team("Leonida");
    
    //added player name
    t.addPlayer("Lucia");
   //1.i - set rank number of team in 1.g
    t.setRank(6);

    System.out.println(t);

    //1.k - 5 more team instances printed with toString() method
    Team t1 = new Team("Los Santos");
        t1.addPlayer("Franklin");
        t1.setRank(5);
        System.out.println(t1.toString());

    Team t2 = new Team("Las Venturas");
        t2.addPlayer("Big Smoke");
        t2.setRank(4);
        System.out.println(t2.toString());
    
    Team t3 = new Team("San Andreas");
        t3.addPlayer("CJ");
        t3.setRank(3);
        System.out.println(t3.toString());
     
    Team t4 = new Team("Liberty City");
        t4.addPlayer("Tommy Vercetti");
        t4.setRank(2);
        System.out.println(t4.toString());

    Team t5 = new Team("Vice City");
        t5.addPlayer("Jason");
        t5.setRank(1);
        System.out.println(t5.toString());
  }

}