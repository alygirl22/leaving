/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham;

import java.io.Serializable;

/**
 *
 * @author Curtis
 */
public class Food implements Serializable{
    
    //class instance variables
    private double fruit;
    private double vegetable;
    private double water;

    public Food() {
    }

    public double getFruit() {
        return fruit;
    }

    public void setFruit(double fruit) {
        this.fruit = fruit;
    }

    public double getVegetable() {
        return vegetable;
    }

    public void setVegetable(double vegetable) {
        this.vegetable = vegetable;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.fruit) ^ (Double.doubleToLongBits(this.fruit) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.vegetable) ^ (Double.doubleToLongBits(this.vegetable) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.water) ^ (Double.doubleToLongBits(this.water) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Food{" + "fruit=" + fruit + ", vegetable=" + vegetable + ", water=" + water + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.fruit) != Double.doubleToLongBits(other.fruit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.vegetable) != Double.doubleToLongBits(other.vegetable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.water) != Double.doubleToLongBits(other.water)) {
            return false;
        }
        return true;
    }
    
    
}