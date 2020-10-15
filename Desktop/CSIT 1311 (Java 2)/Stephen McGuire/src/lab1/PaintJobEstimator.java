package lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Scanner;
import lab1.StringClass;
import static lab1.StringClass.VerifyInt;



/**
 *
 * @author sbmcguire
 */
public class PaintJobEstimator {   
    
    public static void main(String[] args) {
        
        // Declaring Vars
        int numberOfGallons = 0, rooms;
        double laborCharges = 0, hoursOfLabor = 0, totalCost =0, squareFeet = 0, hours = 0, sqFeet = 0; 
        
        // Getting the $ with the money values
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        
        // pulls the getTotal method
       totalCost = PaintJobEstimatorStaticMethods.getTotal(squareFeet);
       
       // displays the total amount of the whole job
       JOptionPane.showMessageDialog(null, "The total amount for this job is: " +fmt1.format(totalCost));
        
        }
    }  

