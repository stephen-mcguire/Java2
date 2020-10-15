/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Stephen
 * this class just gets the values of the defined classes
 */
public class RetailItem {
    
    // declaring the variables 
    double retailPrice; 
    String description;
    int unitsOnHand;
    
    public void setDescription(String description1) {   // sets description to description1
        description = description1;
    }
    
    public void setRetailPrice(double Price) {     //sets retailPrice to price
        retailPrice = Price;
    }
    
    public void setUnitsOnHand(int units) {    // sets units on hand to units 
        unitsOnHand = units;
    }
    
    public String getDescription() {   // gets the value from description
        return description;
    }
    
    public double getRetailPrice() {  //gets the value of retail price 
        return retailPrice;
    }
    
    public int getUnitsOnHand() {  //gets value of unitsOnHand
        return unitsOnHand;
    }
    
    // makes the output of the other outputs to a string 
    public String toString() {
        String allItemDetails;
        
        allItemDetails = description +"\t" + unitsOnHand +"\t" + retailPrice;
        
        return allItemDetails;
    }
            
    
}
