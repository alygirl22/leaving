/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham.control;

/**
 *
 * @author Curtis
 */
public class manufactureShelterControl {
    
    public double calcBuildShelter(double tarp, double hammer, double sticks,double  rope, double axe, double drill){
        
        if (tarp < 1 || tarp > 5) { // is there the right amount of tarp?
            return -1;
        }
        
        if (hammer < 1 || hammer > 5){ // right amount of hammers?
            return -1;
        }
        
        if (sticks < 4 || sticks > 10){ // right amount of sticks?
            return -1;
        }
        
        if (rope < 2 || rope > 6){ // right amount of rope?
            return -1;
        }
        
        if (axe < 1 || axe > 5){ // right amount of axes?
            return -1;
    }
        
        if (drill < 1 || drill > 5){ // right amount of drills?
            return -1;
        }
        
        double shelter = tarp + hammer + sticks + rope + axe + drill;
        
        return shelter;
        
    }
    
}
