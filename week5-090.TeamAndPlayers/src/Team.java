
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Team {
    private String name; 
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;       
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (playerList.size() < this.maxSize){ 
            playerList.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player players : playerList) {
            System.out.println(players);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return playerList.size();
    }
    
    public int goals() {
        int goals = 0;
        for (Player players : playerList) {
            goals += players.goals();
        }
        return goals;
    }
}
