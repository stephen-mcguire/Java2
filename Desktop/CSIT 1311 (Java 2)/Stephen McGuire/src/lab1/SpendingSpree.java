/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JFrame;
/**
 *
 * @author Stephen McGuire 
 * 
 * Program Information: This program grants the user with $200 Dollars to spend.
 * In addition, this program allows you to buy only THREE items less than or 
 * equal to the above amount. If the user tries to buy something that costs 
 * too much with the remaining balance, it will tell you that "you do not have 
 * enough to spend." The program will end after THREE transactions.
 * 
 * Lab Assignment 1, SpendingSpree.
 * 
 * 
 */
public class SpendingSpree {
    public static void main(String args[]) {
        
        //Declaring the two Constants
        final double CERTIFICATE = 200;
        final int PURCHASE_LIMIT = 3;
        double moneyLeft;
        double itemsLeft;
        //double tv = 100;
        double boughtAmount;
        boolean cert = true; 
        //Declaring the USD
        //NumberFormat fmt1 = new NumberFormat.getCurrencyInstance();
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();    
       JOptionPane.showMessageDialog(null, "You won a $200 " +
                    "Gift Card! "+ "You can only pick three items to buy, have "
                    + "fun!");  
       
            
                    // PROGRAM IS NOT FINISHED \\
                  
                 //loops the program   
               while (2>0) {  
                    
            JFrame frame = new JFrame();
            String message = "Would you like to buy a $100 tv?";
            double answer = JOptionPane.showConfirmDialog(frame, message);
            
                if (answer == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "you can only buy " +" "+(PURCHASE_LIMIT -1 ) +" "+
                        "more items with your remaining balance of  "+fmt1.format((CERTIFICATE - 100)));
                
                }else if (answer == JOptionPane.NO_OPTION) {
                    
                    double trash = JOptionPane.showConfirmDialog(null, "Would you like to buy a "+ " $50 trash can? ");
                
                if (trash == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "You can buy " + (PURCHASE_LIMIT -2) +" "+ 
                                "more item, with the remaining balance of " +
                                fmt1.format((CERTIFICATE - 150)));
                        
                 }else if (trash == JOptionPane.NO_OPTION) {
                     // ADD HEADSET 
                     double headSet = JOptionPane.showConfirmDialog(null, "Would you like to buy a "+ " $50 head set? ");
                       
                        if (headSet == JOptionPane.YES_OPTION) {
                        
                            JOptionPane.showMessageDialog(null, "That is all you can buy! " + (PURCHASE_LIMIT -3) +" "+ 
                                "more item, with the remaining balance of " +
                                fmt1.format((CERTIFICATE - 200)));
                       }else if (headSet == JOptionPane.NO_OPTION) {
                           
                            System.out.println("I need to add another item!");
                       }else{
                           JOptionPane.showMessageDialog(null, "You need to pick Yes or no");
                           }
                     
                 
                 }else{
                   System.out.println("YOu need to pick an item");  
                 }
                    
                    
                    
                }else{
                    System.out.println("you need to pick an item");
                     }
                
                    }
               
                }      
            }       
                   
                      
                
                    //double headSet = JOptionPane.showConfirmDialog(null, "Would you like to buy a "+ " $50 head set? ");
                
              
                        
                   
                
                    //do code here
                
            
                
            
                           
                
                    
                
                    
                
                
                
            
        
        
                