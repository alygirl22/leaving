/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;
import leaving.planet.earth.LeavingPlanetEarth;

/**
 *
 * @author aly_cheers17
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        String name;
        
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        LeavingPlanetEarth.setPlayer(player); // save the player
        
        return player;
    }
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
