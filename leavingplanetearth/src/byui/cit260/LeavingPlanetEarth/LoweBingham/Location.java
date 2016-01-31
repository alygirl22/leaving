/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Curtis
 */
public class Location implements Serializable {
    
    //class instance variables
    private String location;
    private String visited;
    private double amountRemaining;

    public Location() {
    }
    
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.location);
        hash = 89 * hash + Objects.hashCode(this.visited);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "location=" + location + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        return true;
    }
    
    
}
