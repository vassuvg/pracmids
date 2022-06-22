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
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee First Name: ");
        String First_name = sc.nextLine();
        System.out.println("Employee Last Name: ");
        String Last_name = sc.nextLine();
        System.out.println("Employee Base pay: ");
        double base_Pay = sc.nextDouble();
        System.out.println("Employee Sales amount: ");
        double sales_amt = sc.nextDouble();
        System.out.println("Employee Commission rate : ");
        double comm_rate = sc.nextInt();

  
    }
}
