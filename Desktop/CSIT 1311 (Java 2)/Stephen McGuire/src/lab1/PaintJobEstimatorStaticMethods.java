/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen
 */
public class PaintJobEstimatorStaticMethods {
    
  
    // asks user for the amount of rooms they have in the house
    public static int getRooms() {
        
        
   String roomsString = (JOptionPane.showInputDialog(null, "How many rooms do you have?"));
   
        int rooms = StringClass.VerifyInt(roomsString);
        
   
        return rooms;
    }
    
    // getSquareFeet should prompt the user for the number of square feet in each room, and return the total square feet (all rooms). 
    
    public static int getSquareFeet(int rooms) {
      // check and see if this is right, with data validation
      int sqrFeetTotal = 0;
      int sqrFeet;
     
        for (int i = 0; i < rooms; i++) {
             String userString = (JOptionPane.showInputDialog(null, "How many square feet is this room?"));
       
            
      
       
            sqrFeet = StringClass.VerifyInt(userString);
        
        
            sqrFeetTotal = sqrFeetTotal + sqrFeet ;
        
        }
            
          return sqrFeetTotal;
          
        }
    
    
    
    
    
    
    
    // asks for the cost of the paint
    public static double getPricePerGallon() {
     
    double paintCost = 0;   
    double galAmount;
    double galPriceTotal = 0;
    
        String galPriceString = JOptionPane.showInputDialog(null, "what is the cost of the paint: ");
        
        galAmount = StringClass.VerifyDouble(galPriceString);
        //come back to calculate how much each item will do.
        
        //alPriceTotal = galAmount * paintCost;
              
        return galAmount;
            
        }
      
      
    
    // computes the totoal for all of the methods, then displays
    // the total price and other costs
    public static double getTotal(double squareFeet) {
       //double gTotal = Sum;
       int hours1 = 0, rooms, numberOfGallons = 0;
       double sqFeet1 = 0;
       double galPrice1 = 0;
       double hours2 = 0;
       double paint = 0, laborCharges, hoursOfLabor = 0, sqFeet = 0, hours = 0, sum, totalCost, galPrice = 0;
       double sqFeetGalPrice, gallon, paintCost, sqrFeetTotal; 
       
       
       rooms = getRooms();
        System.out.println("get rooms: " +rooms);
        
       squareFeet = getSquareFeet(rooms);
        System.out.println("squareFeet " +squareFeet);
        
       numberOfGallons = (int) getGallons(squareFeet);
        System.out.println("numberOfGallons: " +numberOfGallons);
        
         paintCost = getPaintCost(squareFeet, galPrice);
        System.out.println("paintcost " +paintCost);
        
        hoursOfLabor = getHours(squareFeet);
        System.out.println("hoursOfLabor: " +hoursOfLabor);
        
       laborCharges = getLabor(hoursOfLabor);
        System.out.println("laborCharges: " +laborCharges);
       
       totalCost = laborCharges + paintCost;
        System.out.println("totalCost: " +totalCost);
       
      
      
       
       sum = totalCost;
     
      
      
       return totalCost; 
        }
    
    
    // gets the total price of the paint 
    public static double getPaintCost(double sqFeet, double galPrice) {
        String tt1 = JOptionPane.showInputDialog(null, "how much is the paint?");
        double tt2 = StringClass.VerifyDouble(tt1);
        
        double sqFeetGalPrice = tt2 * sqFeet + (galPrice);
       
        return sqFeetGalPrice;
        }
    
    
    
    // gets the total amount of paint you need
    public static double getGallons(double sqFeet) {
        System.out.println(sqFeet);
        double gallon = (sqFeet / 115.0) * 1.0;
        
        
        return gallon;
        }
    
    
    // gets the hourly rate 
    public static double getHours(double sqFeet) {
        
        double hours = (sqFeet / 115.0) * 8.0;
        
        System.out.println(hours);
        
        
        return hours;
        }
    
    // gets the labor costs
    public static double getLabor(double hours) {       
        
        double labor = (hours * 18.00);
        
        return labor;
    }

    
    
}
