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
public class ProductionWorker extends Employee {
    
    private int shift;
    private double hourlyPayRate;
    
    public ProductionWorker(String name, String number, String hireDate, int shift, double wagePay) {
        super(name, number, hireDate);
        this.shift = shift;
        this.hourlyPayRate = wagePay;
    }
    
    public ProductionWorker(ProductionWorker proWorker) {
        super(proWorker.getName(), proWorker.getName(), proWorker.getHireDate());
        this.shift = proWorker.getShift();
        this.hourlyPayRate = proWorker.getWagePay();
    }
    
    public int getShift() {
        return shift;
    }
    
    public double getWagePay() {
        return hourlyPayRate;
    }
    
    public void setShift(int shifts) {
        this.shift = shifts;
    }
    
    public void setWagePay(double wagePayer) {
        this.hourlyPayRate = wagePayer;
    }
    
    @Override
    public String toString() {
        String test = super.toString();
        test += "\nEmployee Shift: " +shift+ "\nEmployee Hourly Pay Rate: " +hourlyPayRate;
        return test;
    }
    
    
}
    
   
