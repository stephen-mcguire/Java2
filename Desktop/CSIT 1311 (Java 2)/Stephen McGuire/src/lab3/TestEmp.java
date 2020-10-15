/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.*;

/**
 *
 * @author sbmcguire
 */
public class TestEmp {
    public static void main(String[] args) {
        String bob;
        Employee test1 = new Employee();
        
        bob = test1.getName() + test1.getNumber() + test1.getHireDate();
        
        JOptionPane.showMessageDialog(null, "tBob info: "+bob);
    }   
}
