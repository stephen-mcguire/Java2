/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen
 */
public class FileCheckerDemo {
    public static void main(String[] args) throws Exception  {
        //java.io.File file = new java.io.File("C:/MyFile.txt");
           int write100 = 100;
        int[] randomizer = new int[write100];
        Random random = new Random();

    File file = new File("C:\\MyFile.txt"); //File path

    if(file.exists()) {   //If the file exists, print out each element on the file.
    Scanner input = new Scanner(file);
    int count = 0;
    while(input.hasNextInt()) {
        randomizer[count++] = input.nextInt();
        input.close();
    Arrays.sort(randomizer);
    }
    

    for(int i = 0; i < write100; i++) {
        System.out.println(randomizer[i]);
    }
}
    else {   //If the file isn't found, create it and write 100 random numbers to it.
        try (PrintWriter output = new PrintWriter(file)) {
            for(int i = 0; i < write100; i++) {
                randomizer[i] += random.nextInt(101);
                //Arrays.sort(randomizer);
            }
                Arrays.sort(randomizer);
            for(int i = 0; i < write100; i++) {
            output.print(randomizer[i] + ""); // Write the array to the file
            //output.print(randomizer[i] + " ");
}    
                //output.print(randomizer[i] + " ");
                
            }catch(FileNotFoundException ex) {
           System.out.println("File was not found.");
           
           
        }           
        
        
        catch(Exception ex)
        {
            System.out.println("Something went wrong.");
        }
    }
    
} 
       
}   
    




