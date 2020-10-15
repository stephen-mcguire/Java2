/*
 * Program Made By Stephen McGuire
    
    this program shows the output of a retail store, with how much is in stock and 
the price of the items.
 */
package lab1;
import java.text.DecimalFormat;
import javax.swing.*;
/**
 *
 * @author Stephen
 */
public class RetailItemTest {
    
    public static void main (String[] args) {
        
        DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
        
        // Jackets
        RetailItem item1 = new RetailItem();
        
        item1.setDescription("Jacket");
        item1.setUnitsOnHand(12);
        item1.setRetailPrice(59.95);
        
        // Designer Jeans
        RetailItem item2 = new RetailItem();
        
        item2.setDescription("Designer Jeans");
        item2.setUnitsOnHand(40);
        item2.setRetailPrice(34.95);
        
        // Shirt
        RetailItem item3 = new RetailItem();
        
        item3.setDescription("Shirt");
        item3.setUnitsOnHand(20);
        item3.setRetailPrice(24.95);
        
        // Showing description on Jackets
        
        JOptionPane.showMessageDialog(null, item1.getDescription() 
        +"\n"+item1.getDescription() +" "+ "Units on hand: "+"\n"+item1.getUnitsOnHand() +"\n"
        + "Price: " +item1.getRetailPrice());
        
        // showing description on Designer Jeans
        JOptionPane.showMessageDialog(null, item2.getDescription() 
        +"\n"+item2.getDescription() +" "+ "Units on hand: "+"\n"+item1.getUnitsOnHand() +"\n"
        + "Price: " +item2.getRetailPrice());
        
        // Showing Description on Shirts
        JOptionPane.showMessageDialog(null, item3.getDescription() 
        +"\n"+item3.getDescription() +" "+ "Units on hand: "+"\n"+item3.getUnitsOnHand() +"\n"
        + "Price: " +item3.getRetailPrice());
        
    }
    
}
