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
public class CommissionEmployee extends Employee{

    private double sales_amt;
    private double comm_rate;
    
    public CommissionEmployee(String First_name, String Last_name, double base_Pay,double sales_amt, double comm_rate) {
        super();
        this.sales_amt = sales_amt;
        this.comm_rate = comm_rate;
    }

    public double getSales_amt() {
        return sales_amt;
    }

    public void setSales_amt(double sales_amt) {
        this.sales_amt = sales_amt;
    }

    public double getComm_rate() {
        return comm_rate;
    }

    public void setComm_rate(double comm_rate) {
        this.comm_rate = comm_rate;
    }

}
