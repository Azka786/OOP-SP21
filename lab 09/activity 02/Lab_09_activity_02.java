
package lab_09_activity_02;

public class Lab_09_activity_02 {

   
    public static void main(String[] args) {
       BasePlusCommEmployee b = new BasePlusCommEmployee("ali ","arslan","25 k ", 100, 5.2, 25000);
    double earn = b.earnings();
    System.out.println("Earning of employee is " + earn);

    }
    
}
