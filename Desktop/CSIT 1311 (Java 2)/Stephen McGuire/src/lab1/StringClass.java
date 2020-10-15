/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sbmcguire
 */
public class StringClass {
    //DecimalFormat df = new DecimalFormat("#.#");
    // Checks if the input entered is a digit
    public static int VerifyInt(String userString) {
    int i;
    for (i = 0; i < userString.length(); i++) {
        
        if (!Character.isDigit(userString.charAt(i))) {
        
            i = 0;
     userString = (JOptionPane.showInputDialog(null, "This is not an integer ex. '1, 2, 3' Please enter a number: "));
    
        }
    } 
   int userInt = Integer.parseInt(userString);
    return userInt;
    }
    // checks to see if number they entered is a double
    public static double VerifyDouble(String userStringDouble) {
        DecimalFormat df = new DecimalFormat("#,###.###");
        int i;
        for (i = 0; i < userStringDouble.length(); i++) {
            
            if (!Character.isDigit(userStringDouble.charAt(i)) || userStringDouble.isEmpty() || !userStringDouble.matches(df.format(userStringDouble))) {
            
            
                    df.format(userStringDouble.charAt(i));
                            i = 0;
                            //df.format(i);
     userStringDouble = (JOptionPane.showInputDialog(null, "This is not a number ex. '1.1, 50.7, 100.9' Please enter a number: "));
     
            }   
        }
        
        double userDouble = Double.parseDouble(userStringDouble);
       return userDouble;
    }
    
    public static String VerifyCharInput(String charInputOnly) {
        
        for (int i = 0; i < charInputOnly.length(); i++) {
            
                if (Character.isDigit(charInputOnly.charAt(i))) {
                    
                    i = 0;
                    
                    charInputOnly = (JOptionPane.showInputDialog(null, "Please enter either, 'A' ' B' 'C' 'D' for the student's answers. "));
                }
                 
        }
        
        return charInputOnly;
    }
    
}
