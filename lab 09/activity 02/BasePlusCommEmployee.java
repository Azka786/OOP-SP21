/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_09_activity_02;

/**
 *
 * @author Azka Malik
 */
public class BasePlusCommEmployee extends commissionEmployee
{
    double salary;
    BasePlusCommEmployee(){
    salary=48000;
}
BasePlusCommEmployee(String A,String E,String B, double C, double D, double S){
    super(A,E,B,C,D);
    salary=S;
}

    @Override
    public double earnings()
{
    return(super.earnings()+salary);
}
    @Override
    public void display()
{
    super.display();
    System.out.println("Salary : "+salary);
}

}
