/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import lab1.StringClass;

/**
 *
 * @author Stephen
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df1 = new DecimalFormat("#,###.###");
        String df = "MM/dd/yyyy";
    SimpleDateFormat format = new SimpleDateFormat(df);
         Employee empAdd = new Employee();
        // empAdd.getName("bobby bob");
        String bob;
        int testString;
        //makes employee object
        Employee emp = new Employee("Stephen McGuire", "999-A", "3/10/2017");
        Employee emp22 = new Employee();
        Employee emp1 = new Employee();
        //emp1.setName("bob dude\n");
        //emp1.setNumber("159-A\n");
        //emp1.setHireDate("1/11/1111\n");
        //bob = emp1.getName() + emp1.getNumber() + emp1.getHireDate();
       //JOptionPane.showMessageDialog(null,bob);
        //Employee bob = emp1;
        
        //System.out.println(bob);
        // Stephen McGuire as employee 
        JOptionPane.showMessageDialog(null,"Current Employee: \n"+emp.getName()+"\n"+"Employee number: "+emp.getNumber()+"\n"+"Hiring date: "+emp.getHireDate());
        // ADD T HIS BACK AND MAKE SURE THAT YOU ADD / CHANGE THE TOSTRING METHOD TO DISPLAY THE EMPPLOYEE INFORMATION CORRECTLY
        //JOptionPane.showMessageDialog(null,"Here is one employee named:\n"+emp.getName()+"\n"+"Employee Number: "+emp.getNumber()+"\n"+"Hiring Date: "+emp.getHireDate());
        
        // production worker object
         ProductionWorker production = new ProductionWorker("Zachary Mitchell", "888-B", "3/10/2017", 1, 50.00);
         //productionWorker1 worker object
         ProductionWorker production1 = new ProductionWorker("Christian Grabeel", "725-B", "3/12/2017", 2, 35.25);
         
         
         // displays the production worker
         JOptionPane.showMessageDialog(null, "Our current day Production Worker is: \n"+production.getName()+"\n"+"Employee Number: "+production.getNumber()+"\n"+"Hiring Date: "+production.getHireDate()+"\n"+"Shift: "+production.getShift());
         
         // displays the output of the production1 night worker
         JOptionPane.showMessageDialog(null, "our current night shift Production Worker is: \n"+production1.getName()+"\n"+"Employee Number: "+production1.getNumber()+"\n"+"Hiring Date: "+production1.getHireDate()+"\n"+"Shift: "+production1.getShift());
         
         //makes shift superviser object
         ShiftSupervisor shiftSup = new ShiftSupervisor("John Cena", "865-Q", "3/11/2017", 65000, 9999);
         
         //displays the shift supervisers information
         JOptionPane.showMessageDialog(null,"Current shift supervisor is: \n" +shiftSup.getName()
                 +"\n"+"Employee Number: "+shiftSup.getNumber()+"\n"+"Hiring Date: "+shiftSup.getHireDate()+"\n"+"Annual Salary: "+shiftSup.getAnnualSalary()
                 +"\n"+"Annual Bonuses: "+shiftSup.getAnnualbonuses());
         
         TeamLeader lead = new TeamLeader("Gitti Negahban", "122-P", "3/10/2017", 1, 15.00, 1500, 100, 50);
         
         JOptionPane.showMessageDialog(null, "Current team leader is: \n"+lead.getName()
         +"\n"+"Employee Number: "+lead.getNumber()+"\n"+"Hiring Date: "+lead.getHireDate()+"\n"+"Shift: "+lead.getShift()
         +"\n"+"Current Salary: "+lead.getWagePay()+"\n"+"Monthly Bonus: "+lead.getMonthlyBonus()
         +"\n"+"Required training hours: "+lead.getRequiredTrainingHours()
         +"\n"+"Completed training hours: "+lead.getCompletedTrainingHours());
         
         // COME BACK TO ADD EMPLOYEES / PRODUCTION WORKER / SHIFT SUPER/ TEAM LEAD
        // Asking asked = new Asking();
        
        String testBob;
         testString = JOptionPane.showConfirmDialog(null, "Do you want to add "
                 +"another employee? ");
         while(testString == JOptionPane.YES_OPTION) {
         String userInput = JOptionPane.showInputDialog(null, "Please enter 1 for adding employee, 2 for production worker, 3 for shif supervisor, 4 for team leader ");
        int verifyUserInput = Integer.parseInt(userInput);
        String pattern = "^[A-M0-9_.-]$";
         
                if (verifyUserInput == 1) {
                    
                  String testEmp = JOptionPane.showInputDialog(null, "Name of employee? ");
                  
                  
                 String testEmp11= JOptionPane.showInputDialog(null, "Employee Number? Note: has to be three numbers '123' with a dash '-' and a letter A through M that are capped 'A' ");
                  
                  // String pattern = "\\d[0-9,-]{3}";
                   // while(testEmp11.matches(pattern)) {
                      if (testEmp11.length() != 5) {  
                          JOptionPane.showMessageDialog(null,"Invalid employee number, use this example: 111-A ");
                      }
                      
                      else if ((((!Character.isDigit(testEmp11.charAt(0))) || ((!Character.isDigit(testEmp11.charAt(1)))) ||
                  ((!Character.isDigit(testEmp11.charAt(2)))) || (testEmp11.charAt(3) !='-') || 
                  (!(testEmp11.charAt(4)>= 'A' && testEmp11.charAt(4)<='M'))))) {
                       
                          JOptionPane.showMessageDialog(null, "please enter correctly ");
                      }
                 
                //}    
                  
                String testEmp111 = JOptionPane.showInputDialog(null, "when was this person hired? ");
                //checks if the date matches this select form \\ 
                if(!testEmp111.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) { 
                    
                    JOptionPane.showMessageDialog(null, "please enter correct date: DD/mm/yyyy");
                     
                    
                }else{
                   JOptionPane.showMessageDialog(null,"The employee named: "+testEmp +"\n" 
                +"employee number: "+testEmp11 +"\n" +"date hired: "+testEmp111); 
                }
                
                 
                    
                    
                    
                  // input for 2nd option \\ 
                }else if (verifyUserInput == 2) {
                    
                     String testEmp = JOptionPane.showInputDialog(null, "Name of employee? ");
                  
                  
                 String testEmp11= JOptionPane.showInputDialog(null, "Employee Number? Note: has to be xxx-A-L ");
                  
                  
                      if (testEmp11.length() != 5) {  
                          JOptionPane.showMessageDialog(null,"Invalid employee number, use this example: 111-A ");
                      }
                      
                      // verify the input of the three numbers and checks to see if there is a dash and a capital letter
                      else if(!Character.isDigit(testEmp11.charAt(0)) || !Character.isDigit(testEmp11.charAt(1)) 
                              || !Character.isDigit(testEmp11.charAt(2)) || testEmp11.charAt(3) !='-' 
                              || (!(testEmp11.charAt(4)>= 'A' && testEmp11.charAt(4)<='M'))) {
                         JOptionPane.showMessageDialog(null, "please enter correctly "); 
                      }
                      
                      
                    
                  
                String testEmp111 = JOptionPane.showInputDialog(null, "when was this person hired? ");
                
                if(!testEmp111.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) {
                    JOptionPane.showMessageDialog(null, "please enter correct date: DD/mm/yyyy");
                    
                    
                }
                    
                    
               
                 
                String testEmp1111 = JOptionPane.showInputDialog(null, "Does this production worker work days '1' or nights '2'? ");
                
                while (testEmp1111.charAt(0) >= 1 && testEmp1111.charAt(0) <= 2) {
                    if(testEmp1111.charAt(0) == 1) {
                        testEmp1111 += "day shift"; 
                        }
                    
                    if (testEmp1111.charAt(0) == 2) {
                        testEmp1111 += "night shift";
                        }
                    
                    }
                String testEmp11111 = JOptionPane.showInputDialog(null, "How much will this employee make hourly?");
                
                   if(!Character.isDigit(testEmp11111.charAt(0)) || testEmp11111.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                   }else{
                       JOptionPane.showMessageDialog(null, "The production worker named: "+testEmp +"\n" 
                +"employee number: "+testEmp11 +"\n" +"date hired: "+testEmp111 
                       +"\n" +testEmp1111+ "\n" +"this is how much they make hourly"+testEmp11111); 
                   }
                   
                   
                   
                   // input for 3rd option \\ 
                }else if (verifyUserInput == 3) {
                String testSup = JOptionPane.showInputDialog(null, "Name of employee? ");
                  
                 
                 String testEmp11= JOptionPane.showInputDialog(null, "Employee Number? Note: has to be three numbers '123' with a dash '-' and a letter A through M that are capped 'A' ");
                  
                   if (testEmp11.length() != 5) {  
                          JOptionPane.showMessageDialog(null,"Invalid employee number, use this example: 111-A ");
                      }
                      
                      else if ((((!Character.isDigit(testEmp11.charAt(0))) || ((!Character.isDigit(testEmp11.charAt(1)))) ||
                  ((!Character.isDigit(testEmp11.charAt(2)))) || (testEmp11.charAt(3) !='-') || 
                  (!(testEmp11.charAt(4)>= 'A' && testEmp11.charAt(4)<='M'))))) {
                       
                          JOptionPane.showMessageDialog(null, "please enter correctly ");
                      }
                   
                   String testEmp111 = JOptionPane.showInputDialog(null, "when was this person hired? ");
                
                if(!testEmp111.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) {
                    JOptionPane.showMessageDialog(null, "please enter correct date: DD/mm/yyyy");
                    
                    
                }
               
                 
                String testEmp1111 = JOptionPane.showInputDialog(null, "Does this Shift Supervisor work days '1' or nights '2'? ");
                
                while (testEmp1111.charAt(0) >= 1 && testEmp1111.charAt(0) <= 2) {
                    if(testEmp1111.charAt(0) == 1) {
                        testEmp1111 += "day shift"; 
                        }
                    
                    if (testEmp1111.charAt(0) == 2) {
                        testEmp1111 += "night shift";
                        }
                }
                
                String testEmp11111 = JOptionPane.showInputDialog(null, "What is the salary of this Shift Supervisor? ");
                
                   if(!Character.isDigit(testEmp11111.charAt(0)) || testEmp11111.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                   }
                   
                   String testEmpBonus = JOptionPane.showInputDialog(null, "What bonuses does this employee receive? ");
                   
                   if(!Character.isDigit(testEmpBonus.charAt(0)) || testEmpBonus.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                   }else{
                       JOptionPane.showMessageDialog(null, "The production worker named: "+testSup +"\n" 
                +"employee number: "+testEmp11 +"\n" +"date hired: "+testEmp111 
                       +"\n" +testEmp1111+ "\n" +"this is their salary"+testEmp11111
                       +"\n" +"This is the bonuses they recieve"+testEmpBonus);
                   }
                   
                   
                   
                   
                // input for 4th \\
            }else if (verifyUserInput == 4) {
                
                String testTeamLead = JOptionPane.showInputDialog(null, "Name of employee? ");
                  
                 
                 String testEmp11= JOptionPane.showInputDialog(null, "Employee Number? Note: has to be three numbers '123' with a dash '-' and a letter A through M that are capped 'A' ");
                  
                   if (testEmp11.length() != 5) {  
                          JOptionPane.showMessageDialog(null,"Invalid employee number, use this example: 111-A ");
                      }
                      
                      else if ((((!Character.isDigit(testEmp11.charAt(0))) || ((!Character.isDigit(testEmp11.charAt(1)))) ||
                  ((!Character.isDigit(testEmp11.charAt(2)))) || (testEmp11.charAt(3) !='-') || 
                  (!(testEmp11.charAt(4)>= 'A' && testEmp11.charAt(4)<='M'))))) {
                       
                          JOptionPane.showMessageDialog(null, "please enter correctly ");
                      }
                   
                   String testEmp111 = JOptionPane.showInputDialog(null, "when was this person hired? ");
                
                if(!testEmp111.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) {
                    JOptionPane.showMessageDialog(null, "please enter correct date: DD/mm/yyyy");
                    
                    
                }
               
                 
                String testEmp1111 = JOptionPane.showInputDialog(null, "Does this Team Leader work days '1' or nights '2'? ");
                
                while (testEmp1111.charAt(0) >= 1 && testEmp1111.charAt(0) <= 2) {
                    if(testEmp1111.charAt(0) == 1) {
                        testEmp1111 += "day shift"; 
                        }
                    
                    if (testEmp1111.charAt(0) == 2) {
                        testEmp1111 += "night shift";
                        }
                }
                
                String testEmp11111 = JOptionPane.showInputDialog(null, "What is the salary of this Team Leader? ");
                
                   if(!Character.isDigit(testEmp11111.charAt(0)) || testEmp11111.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                   }
                   
                   String testEmpBonus = JOptionPane.showInputDialog(null, "What bonuses does this employee receive? ");
                   
                   if(!Character.isDigit(testEmpBonus.charAt(0)) || testEmpBonus.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                   }
                   
                   String totalNumReq = JOptionPane.showInputDialog(null, "How many hours does this Team Leader have?");
                   
                   while(totalNumReq.charAt(0) >= 50) {
                   
                   if(!Character.isDigit(totalNumReq.charAt(0)) || totalNumReq.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "please enter a number");
                       
                   }else if(totalNumReq.charAt(0) < 50 || totalNumReq.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "Please enter a vaid number");
                   }
                   
                   else{
                       JOptionPane.showMessageDialog(null, "The production worker named: "+testTeamLead +"\n" 
                +"employee number: "+testEmp11 +"\n" +"date hired: "+testEmp111 
                       +"\n" +testEmp1111+ "\n" +"this is their salary: "+testEmp11111
                       +"\n" +"This is the bonuses they recieve: "+testEmpBonus
                       +"\n" +"Current hours: "+totalNumReq);
                   }
                   
                   }
                   
                   
            }
         if(testString == JOptionPane.NO_OPTION || testString == JOptionPane.CANCEL_OPTION || testString == JOptionPane.CLOSED_OPTION) {
             JOptionPane.showMessageDialog(null, "Have a good day!");
         }
              
        }
    }
}
         
         
         
         
        
       
    

    

