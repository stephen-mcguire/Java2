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
public class Employee {
    
    private String name;
    private String number;
    private String hireDate;
    
    public Employee() {
        name = "";
        number = "";
        hireDate = "";
    }
    
    public Employee(String nam, String num, String hire) {
        name = nam;
        number = num;
        hireDate = hire;
    }
    
    public void setName(String nam) {
        name = nam;
    }
    
    public void setNumber(String num) {
        number = num;
    }
    
    public void setHireDate(String hire) {
        hireDate = hire;
    }
    
    public String getName() {
        return name;
    }
    
    public String getHireDate() {
        return hireDate;
    }
    
    public String getNumber() {
        return number;
    }
    
    
    
}


