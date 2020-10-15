/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.File;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class FileChecker {
   private java.io.File file = new java.io.File("C:/MyFile.txt");
   //private File testFile = file;
   Scanner input = new Scanner(System.in);
   private String fileCheck;
   private String testFileChecking1;
   private int write100 = 100;
   private int[] randomizer;
   //private int write100;
   public FileChecker() {
       fileCheck = "";
      // int write100 = 100;
      // int[] randomizer;
   }
  public FileChecker(String fileChecks) throws Exception {
      Scanner fileTester = new Scanner(file);
      fileCheck = fileChecks;
      int testFileChecker;
      String testFileChecker1;
      int write100 = 100;
      int[] randomizer = new int[write100];
      Random random = new Random();
      
      
      //testFileChecking1 = input.nextLine();
      
     // int yesOption = JOptionPane.YES_NO_OPTION;
      
      
    //  testFileChecker1 = JOptionPane.showInputDialog(null, "Do you habe the file 'MyFile.txt?' enter the file name: ");
     //testFileChecker = JOptionPane.showConfirmDialog(null, "Do you have the file 'MyFile.txt?'");
     
     
     // add a try catch to see if the file is located on the computer
     // and add all the options for data validation
     if (file.exists()) {
         Arrays.sort(randomizer);
         while(input.hasNextLine()) {               
            System.out.println(input.nextLine());
        }
            input.close();
    
         
      JOptionPane.showMessageDialog(null, "you already have the file: ");   
     }else{
      try(PrintWriter output = new PrintWriter(file)) {
         for(int i = 0; i < write100; i++) {
             randomizer[i] += random.nextInt(101);
             output.print(randomizer[i] +" ");        
         }
     
      
             
       //java.io.PrintWriter output = new java.io.PrintWriter(file);
             
       //  FileReader fReader = new FileReader(testFileChecking1);
            
        // BufferedReader inputFile = new BufferedReader(fReader);
            
         
         
         // add stuff in here to write to file
     
  }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "file not found");  
        }
      
  
     }
  }

    public FileChecker(String fileCheck, String testFileChecking1, int[] randomizer) {
        this.fileCheck = fileCheck;
        this.testFileChecking1 = testFileChecking1;
        this.randomizer = randomizer;
    }
  public String setFileCheck(String fileChecks) {
      fileCheck = fileChecks;
      return fileChecks;
  }
  
   public String getFileCheck() {
       return fileCheck;
   }
   
   //public int setWrite100(int testingInt) {
       //write100 = testingInt;
     //  return testingInt;
   //}
   
   //public int getWrite100() {
     //  return write100;
   //}
    
   //public int[] setRandomizer(int[] randomArray) {
       //randomizer = randomArray;
     //  return randomArray;
   //}
   
   //public int[] getRandomizer() {
 //      return randomizer;
 //  }
   
  // public static String getFileChecks() {
       
   //}
  
    
  /*  
   if (!testFileChecker1.equals(file)) {
    // if(testFileChecker == JOptionPane.YES_OPTION) {
    
         try {
             
            FileReader fReader = new FileReader(testFileChecking1);
            
            BufferedReader inputFile = new BufferedReader(fReader);
            
            
            
          JOptionPane.showMessageDialog(null, "You have the file");
          
         }catch(FileNotFoundException e){
             JOptionPane.showMessageDialog(null, "You do not have the file. Making file: ");
             
         }
     //}



try (
      // Create a file
      java.io.PrintWriter output = new java.io.PrintWriter(file);
    ) {
      // Write formatted output to the file
      output.print("John T Smith ");
      output.println(90);
      output.print("Eric K Jones ");
      output.println(85);
    }

*/

     }
   
   
    

