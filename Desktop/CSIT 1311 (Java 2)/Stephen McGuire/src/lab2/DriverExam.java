/*
 * 
 */
package lab2;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Stephen McGuire
 * Program: program that grades the written portion of the driver"s license exam.
 * Description: The exam has 20 multiple choice questions. The student must correctly answer 15 out of 20 to pass the exam. 
 *
 */
public class DriverExam {
    DriverExam() {
         
         
     }
    Scanner scan = new Scanner(System.in);
    private final static String[] KEY = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"}; 
    private int correct = 0;
    private int incorrect = 0;
    private boolean[] missed;
   // private int[] missed1;
    private String[] studentAnswers;
    //private char[] answers;
   // private final static char[] KEYS = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'}; 
    
    
    //String tesingThing = JOptionPane.showInputDialog(answers);
    
    // public DriverExam (char[] ans) {
        // answers = ans;
    // }
     //public DriverExam ()
  
    
    public DriverExam (String[] answers) {
        
       missed = new boolean [answers.length];
       studentAnswers = new String[answers.length];
       correct = 0;
       incorrect = 0;
       
       for (int i = 0; i < answers.length; i++) {
                studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(KEY[i]);
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }
            }
       
        }
    
    public String[] getKey() {
        return KEY;
    }

    //public S
    public String[] getStudentAnswers(String[] answers) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < answers.length; i++) {
                studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(KEY[i]);
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }
            }
        
        return studentAnswers;
    }
    
    //public void setStudentAnswers(String[] studentAnswers) {
      // this.studentAnswers = studentAnswers;
       /*
        for (int i = 0; i < answers.length; i++) {
                studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(KEY[i]);
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }
            }
        */
    //}
    
    
    
    //public String[] setDriverExam1 (String[] answers) {
      //  studentAnswers = answers;
     //   return answers;
   // }
    
    //public String[] getStudentAnswers(String[] studentAnswers) {
        
        
      //  JOptionPane.showInputDialog(null, "Enter the answers A, B, C, D. ");
        
        //JOptionPane.showInputDialog(null, "enter stuff: ",studentAnswers);
        //return studentAnswers;
    //}
    
    //public void setStudentAnswers(String[] stu) {
      //  studentAnswers = stu;
        //JOptionPane.showInputDialog(null, "enter stuff: ",stu);
    //}

   /*
    public String[] getKey() {
        return KEY;
    }
    
    public void setKey(String[] keyAnswers) {
        KEY = keyAnswers;
        //return key;
    }
    */
    //public boolean passed() {
      /*  if (totalCorrect() >= 15) {
         return true;
        }else {
            return false;
        }
        */
      //  return correct >= 15;
        
    //}
    
   
    
    public int totalCorrect() {
        /*
        for (int i = 0; i < answers.length; i++) {
                studentAnswers[i] = answers[i];
                missed[i] = studentAnswers[i].equalsIgnoreCase(KEY[i]);
                if (!missed[i]) {
                    
                    correct++;
                } else {
                    
                    incorrect++;
                }
            }
        */
        return correct;
    }
    
    public void setTotalCorrect(int correct) {
        this.correct = correct;
    }
    
    
    public int totalIncorrect() {
        
         int incorrectCount = 0; 

      for (int i = 0; i < KEY.length; i++) {
         if (!studentAnswers[i].equalsIgnoreCase(KEY[i])) {
            missed[incorrectCount] = i; 
            incorrectCount++; 
         }
      }
      return incorrectCount;
        //return incorrect; 
    }
    
    public void setTotalIncorrect(int incorrect) {
        this.incorrect = incorrect;
    }
    
   // public int[] questionsMissed1() {
     //   return missed1;
    //}
    
    
    
    public boolean[] questionsMissed(String[] answers) {
        
        //int test1 = KEY.length - totalCorrect();
        
      //boolean[] missed;
        for (int i = 0; i < KEY.length; i++) {
           
           if (studentAnswers[i].equalsIgnoreCase(KEY[i])) {
               
               if (!missed[i]) {
                   correct++;
               }else{
                   incorrect++;
               }
               
           }
           
           //return  test1 = missed.length;
        }
        
        return missed;
    }
    
    public void setQuestionsMissed(boolean[] missed) {
        this.missed = missed;
    }
    
    
   /* 
    public static boolean notCorrect (String stuInput) {
      return "A".equalsIgnoreCase(stuInput) || 
         "B".equalsIgnoreCase(stuInput)
         || "C".equalsIgnoreCase(stuInput) || 
         "D".equalsIgnoreCase(stuInput); 
   }
    
 */   
    
   /*
    public String[] getAllTotal (String[] allTotal) {
        allTotal = "Student Answers: " +studentAnswers
        +"\n"+ "Correct Answers: " +correct+"\n"+"Incorrect Answers: " +incorrect 
        +"Missed answers: " +missed);
        
        return allTotal;
    }
  */
    
    public boolean passed() {
      /*  if (totalCorrect() >= 15) {
         return true;
        }else {
            return false;
        }
        */
        return correct >= 15;
        
    }
    
    @Override
    public String toString() {
        
        
        
        String testString;
        testString = "Student Answers: "+studentAnswers +"\n" 
                + "Correct Answers: " +correct+"\n"
                + "Incorrect Answers: " +incorrect+"\n"
                + "Missed answers: " +missed+"\n";
        
      /*  JOptionPane.showMessageDialog(null,
                "Student Answers: "+studentAnswers +"\n" 
                + "Correct Answers: " +correct+"\n"
                + "Incorrect Answers: " +incorrect+"\n"
                + "Missed answers: " +missed);
        */
        return testString;
        /*
        JOptionPane.showMessageDialog(null, "Student Answers: " +studentAnswers 
        +"\n"+ "Correct Answers: " +correct+"\n"+"Incorrect Answers: " +incorrect 
        +"Missed answers: " +missed);
         */
               /*
                "Student Answers: "+studentAnswers +"\n" 
                + "Correct Answers: " +correct+"\n"
                + "Incorrect Answers: " +incorrect+"\n"
                + "Missed answers: " +missed+"\n";
        */
    }
    
    
   
}



    

