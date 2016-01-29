/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaving.planet.earth;

import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;

/**
 *
 * @author aly_cheers17
 */
public class LeavingPlanetEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Clark Kent");
        playerOne.setBestTime(8.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
