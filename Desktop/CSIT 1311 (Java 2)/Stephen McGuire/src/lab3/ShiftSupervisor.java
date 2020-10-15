/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Stephen
 */
public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualBonuses;
    
    public ShiftSupervisor(String name, String number, String hireDate, double salary, double bonus) {
        super(name, number, hireDate);
        this.annualSalary = salary;
        this.annualBonuses = bonus;
               
    }
    // This constructor will create a new ShiftSupervisor by copying another.
    public ShiftSupervisor(ShiftSupervisor shiftSup) {
        super(shiftSup.getName(), shiftSup.getNumber(), shiftSup.getHireDate());
        this.annualSalary = shiftSup.getAnnualSalary();
        this.annualBonuses = shiftSup.getAnnualbonuses();
    }
    // accesses annual salary
    public double getAnnualSalary() {
        return annualSalary;
    }
    //annualSalary mutator
    public void setAnnualSalary(double updatedSalary) {
        this.annualSalary = updatedSalary;
    }
    
    public double getAnnualbonuses() {
        return annualBonuses;
    }
    
    public void setAnnualBonuses(double annBonus) {
        this.annualBonuses = annBonus;
    }
    
    @Override
    public String toString() {
        String test1 = super.toString();
        test1 += "\n Employee Annual Salary: " + annualSalary + "\nEmployee Annual Bonus: " + annualBonuses;
        
        return test1;
    }
    
    
    
}
