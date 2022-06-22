/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Vassu
 */
import java.util.*;
public class Employee {

    private String First_name;
    private String Last_name;
    private double base_Pay;

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public double getBase_Pay() {
        return base_Pay;
    }

    public void setBase_Pay(double base_Pay) {
        this.base_Pay = base_Pay;
    }

}