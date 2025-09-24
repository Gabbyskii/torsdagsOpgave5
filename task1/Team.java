import java.util.ArrayList;

// 1.b Team entity class
class Team {
    // 1.c Private team name
    private String teamName;
    // 1.d Private team rank
    private int teamRank;
    // 1.e Private player names
    private ArrayList<String> playerName;
    
    // 1.f Constructor with team name parameter
    public Team(String teamName) {
        this.teamName = teamName;
        this.playerName = new ArrayList<>();
    }
    
    // 1.h setRank() method that takes number parameter
    public void setRank(int teamRank) {
        this.teamRank = teamRank;
    }
    
    // 1.l Method to add player to the list
    public void addPlayer(String player) {
        this.playerName.add(player);
    }
    
    // 1.j toString method 
    // 1.m Adjusted to include player names on separate lines
    public String toString() {
        String result = "Hold: " + teamName + " Rang: " + teamRank;
        // for-each loop to include player names on separate lines
        for (String player: playerName) {
            result += ",  - " + player;
        }
        return result;
    }
}
