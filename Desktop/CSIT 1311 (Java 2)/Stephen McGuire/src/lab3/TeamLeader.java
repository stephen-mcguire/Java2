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
public class TeamLeader extends ProductionWorker {
    
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double completedTrainingHours;
  
  public TeamLeader(String name, String number, String hireDate, int shift, double wagePay, double monthlyBonus, double requiredTH, double completedTH) {
    super(name, number, hireDate, shift, wagePay);
    this.monthlyBonus = monthlyBonus;
    this.requiredTrainingHours = requiredTH;
    this.completedTrainingHours = completedTH;
  }
  // constructor creates a new teamleader by copying teamleader
  
  public TeamLeader(TeamLeader tLead) {
    super(tLead.getName(), tLead.getNumber(), tLead.getHireDate(), tLead.getShift(), tLead.getWagePay());
    this.monthlyBonus = tLead.getMonthlyBonus();
    this.requiredTrainingHours = tLead.getRequiredTrainingHours();
    this.completedTrainingHours = tLead.getCompletedTrainingHours();
  }
  
  //the getter, gets the value of monthly bonus
  public double getMonthlyBonus() {
      return monthlyBonus;
  }
  
  //sets the value of monthlyBonus to new value bonus
  public void setMonthlyBonus(double bonus) {
      this.monthlyBonus = bonus;
  }
  
  public double getCompletedTrainingHours() {
      return completedTrainingHours;
  }
  
  public void setCompletedTrainingHours(double hours) {
    this.completedTrainingHours = hours;
  }
  
  public double getRequiredTrainingHours() {
      return requiredTrainingHours;
  }
  
  public void setRequiredTrainingHours(double hours) {
    this.requiredTrainingHours = hours;
  }
  
  @Override
  public String toString() {
    String test2 = super.toString();
    test2 += "\nEmployee Monthly Bonus: " + monthlyBonus +
           "\nEmployee Required Training Hours: " + requiredTrainingHours +
           "\nEmployee Completed Training Hours: " + completedTrainingHours;
    return test2;
  }
  
    
}
