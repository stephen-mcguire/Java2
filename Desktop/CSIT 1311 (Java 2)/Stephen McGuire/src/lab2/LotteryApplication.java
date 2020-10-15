/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen
 */
public class LotteryApplication {
    public static void main(String[] args) {
        LotteryClass lottery = new LotteryClass();
        
        int lotto = lottery.getLotteryNumberArray().length;
        System.out.println("welcome to the lottery! please enter five integers to win the lotery!");
        //JOptionPane.showMessageDialog(null, "welcome to the lottery! please enter five integers to win the lotery!");
        
        //JOptionPane.showMessageDialog(null, "there are ");
        
        //gets input from user
        Scanner scan = new Scanner(System.in);
        
        int[] numbers = new int[lotto];
        
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print((String.format("Enter Numbers %d", i + 1)));
            numbers[i] = scan.nextInt();
            
        }
        
        int compare = lottery.compareArray(numbers);
        
        if (compare == lotto) {
            System.out.println("You won the prize!");
        }else{
            System.out.println("You did not win "+compare + " Here are the numbers.");
        }
        
        
    }
    
}
