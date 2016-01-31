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
public class InventoryItem implements Serializable {
    
    //class instance variables
    private String inventoryType;
    private double inStock;
    private double requiredAmount;

    public InventoryItem() {
    }
    
    

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getInStock() {
        return inStock;
    }

    public void setInStock(double inStock) {
        this.inStock = inStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.inventoryType);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.inStock) ^ (Double.doubleToLongBits(this.inStock) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", inStock=" + inStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inStock) != Double.doubleToLongBits(other.inStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }
    
    
    
}
