/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author sbmcguire
 */
public class Asking extends ProductionWorker {
    
    private String addEmpName;
    private String addEmpNum;
    private String addEmpHire;
    
    
    
    
    public Asking(String name, String number, String hireDate, int shift, double wagePay,
            double monthlyBonus, double requiredTH, double completedTH,
            String empName, String empNum, String empHire) {
        
        super(name, number, hireDate, shift, wagePay);
        this.addEmpName = empName;
        this.addEmpNum = empNum;
        this.addEmpHire = empHire;
    }
    
    public Asking(Asking ask) {
       super(ask.getName(), ask.getNumber(), ask.getHireDate(), ask.getShift(),ask.getWagePay(),ask.getAddEmpHire(), ask.getAddEmpName(), ask.getAddEmpNum());
       this.addEmpHire = ask.getAddEmpHire();
         this.addEmpName = ask.getAddEmpName();
        this.addEmpNum = ask.getAddEmpNum(); 
        
        }
    
    
    
    
    public String getAddEmpName() {
        return addEmpName;
    }
    
    public void setAddEmpName(String empName) {
        this.addEmpName = empName;
        //int testAdd;
        
      //  int testAdd = JOptionPane.showConfirmDialog(null, "Would you like to add an employee? ");
        
       // if (JOptionPane.YES_NO_CANCEL_OPTION == JOptionPane.YES_OPTION) {
           
          
       // }
       //return empName;
    }
    
    public String getAddEmpNum() {
        return addEmpNum;
    }
    
    public void setAddEmpNum(String empNum) {
        this.addEmpNum = empNum;
               
    }
    
    public String getAddEmpHire() {
        return addEmpHire;
    }
    
    public void setAddEmpHire(String empHire) {
        this.addEmpHire = empHire;
    }
    
    
}
