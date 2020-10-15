/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author sbmcguire
 */



public class DriverExamTest {
    public static boolean notCorrect (String answer) {
      return "A".equalsIgnoreCase(answer) || 
         "B".equalsIgnoreCase(answer)
         || "C".equalsIgnoreCase(answer) || 
         "D".equalsIgnoreCase(answer); 
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       DriverExam testing = new DriverExam();
      //boolean[] missedQuestionTotal = testing.questionsMissed();
       
   String[] answers = testing.getKey();
   
              
        
        
      String answer; 

      for (int i = 0; i < 20; i++) {
          
         do {
            System.out.print((i+1) + ": "); 
            answer = scan.nextLine(); 
         } while (!notCorrect(answer)); 

         answers[i] = answer; 
      }
 

      //Results
      System.out.println("  RESULTS  "); 

      //Outputting total correct
      System.out.println("Total Correct: " + testing.totalCorrect()); 

      //Outputting total incorrect
      System.out.println("Total Incorrect: " + testing.totalIncorrect()); 

      String passed = testing.passed() ? "YES" : "NO"; 

      //Result pass or fail
      System.out.println("Passed: " + passed); 
      
      testing.toString();
      if (testing.totalIncorrect() > 0) {
          System.out.println("The incorrect answers are: "+testing.totalIncorrect()); 

          int missedAns; 
          //boolean[] bob = testing.questionsMissed();
          for (int i = 0; i < testing.totalIncorrect(); i++) {
           missedAns = i;
           
            System.out.print(" " + missedAns); 
          }
          
      }
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   }
}
    
    
    
       
       
      
       
       
       //Outputting total correct
     
      
      
      //Returns 
       
      // if (missed.length > 0) {
        //    System.out.print("Questions Missed: ");
              //  for (int i = 0; i < missed.length; i++) {
                //   System.out.print(" "+missed[i]);
       
       
       
       
       
       
       
       
       
       
       
      // JOptionPane.showInputDialog(testing.totalCorrect(args), testing.totalIncorrect(),missed);
       //if (missed.length > 0) {
           
     //JOptionPane.showInputDialog(testing.passed(), testing.totalCorrect(args), testing.totalIncorrect());
       //String answers = new String[answers.length];
       //char stuAnswers = Character.toUpperCase(scan.next().charAt(0));
       //Character.toUpperCase(scan.next().charAt(0));
      // answers = JOptionPane.showInputDialog(answers.length);
        //stuInput = JOptionPane.showInputDialog(answers);
        
        
       //}
        
   
        /*
         for(int i = 0; i < answers.length; i++) {
        stuInput = JOptionPane.showInputDialog(answers);     
             studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(key[i]);
                
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }              
            }
        */
            // get input until input is valid

           // char stuAnswers;

 

            //do {

             //     System.out.print(i + 1 + ". ");

 

                  // get character and make it upper case

           //       stuAnswers = Character.toUpperCase(scan.next().charAt(0));

         //   }

        
       
     //  while (stuAnswers < 'A' || stuAnswers > 'D');
                    
       //             answers[i] = stuAnswers;
                    
                    
       
       //for (int i = 0; i < answers.length; i++) {
            //    studentAnswers[i] = answers[i];
              // missed[i] = studentAnswers[i].equalsIgnoreCase(KEY[i]);
                //if (!missed[i]) {
                    
                  // correct++;
             //  } else {
                    
               //    incorrect++;
           //     }
         //int[] missed = testing.questionsMissed();
         
         //       DriverExam testing = new DriverExam(answers){};
           //     int[] missed = testing.questionsMissed1();
             //    System.out.println();
     // System.out.println("You "+(testing.passed()?"passed" : "did not pass") + ".\n");

     // System.out.println("Correct: " + testing.totalCorrect(args) + "\n");

      //System.out.println("Incorrect: " + testing.totalIncorrect() + "\n");
      //int[] missed = testing.questionsMissed1();
       // if (missed.length > 0) {
         //   System.out.print("Questions Missed: ");
           //     //for (int i = 0; i < missed.length; i++) {
             //       System.out.print(" "+missed[i]);
               //     System.out.println();
               // }
        
            // }
      //]]System.out.println("Questions missed: " + testing.questionsMissed());
                
                
         

         
            //}
       
        //}
        
        
        
        
        
       
        
        
    /*    DriverExam testing = new DriverExam();
        DriverExam testing1 = new DriverExam();
        DriverExam testing2 = new DriverExam();
        DriverExam testing3 = new DriverExam();
        DriverExam testing4 = new DriverExam();
      */
    
    //String[] v;
    
        
        
        
       
        
    
    
            
        //String[] tests;
        //= student.setDriverExam(args);
        
        
        //studentAnswers = new String[tests.length];
        
        //String input = JOptionPane.showInputDialog(null, "test input");
        
        //tests = new String[input.length()];
        //testing.setDriverExam(tests);
        
        
       // JOptionPane.showInputDialog(null, "test!" +bob);
        
      //String testAndStuff = JOptionPane.showInputDialog(null, "testttttt for teh innnpppuuz" +testing.getStudentAnswers());
      
        
        
        //int correct = testing.totalCorrect(), incorrect = testing1.totalIncorrect();
        //boolean[] missed = testing2.questionsMissed();
        //String[] studentAnswers = testing3.getStudentAnswers();
        //int[] testingStu;
        
 //testing4.
        //JOptionPane.showMessageDialog(null, "Welcome! You are going to type in the "
      //+ "student's answers. Please use 'A' 'B' 'C' 'D' when you input the answers. " );
        
        //JOptionPane.showInputDialog(null,testing4.toString());
        //System.out.println(testing4);
      //studentAnswers = JOptionPane.showInputDialog(null, "what is the results for student ones test? ");
    
     /*for (int i = 0; i < answers.length; i++) {
           
                studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(key[i]);
                
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }              
            }
     
     */
                
        //JOptionPane.showInputDialog(null, "what is the results? " +testing);
                
                
         
           
           
            
            
               
              // }     
//}
       
    
    
        
    


     
