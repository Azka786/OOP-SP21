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
public class commissionEmployee {
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;
public commissionEmployee()
{
    FirstName="Nagina";
    LastName="Nazar";
    SSN="S003";
    grossSales=1234.1;
    commonRate=12.5;
}
public commissionEmployee (String a,String e,String b, double c, double d){
    FirstName=a;
    LastName=e;
    SSN=b;
    grossSales=c;
    commonRate=d;
}
public double earnings(){
 return grossSales*commonRate;
}
public void display()
{
System.out.println("first name:"+FirstName+",last name:"+LastName+" ,SSN:"+SSN+" Gross Sale:"+grossSales+" and commonRate:"+commonRate);
}

}


