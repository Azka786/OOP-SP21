
package calculater;


public class Calculater {

public static void sum(int x,int y)
{
    System.out.println(" sum is :"+(x+y));
}
public static void multiply(int x,int y){
    System.out.println("the produt is : "+(x*y));
}
public static void divide(int x, int y){
    System.out.println("the  divided ans is :"+(x/y));
}
public static void modulus(int x,int mod){
    System.out.println("the modulus  is :"+(x%mod));
}
public static void sin(int x){
    System.out.println("sin  is:"+Math.sin(x));
}
public static void cos(int x){
    System.out.println("cos  is : "+Math.cos(x));
}
public static void tan(int x){
    System.out.println("ntan of given number is: "+Math.tan(x));
}
    public static void main(String[] args) {

    Calculater.sum(9,23);
    Calculater.divide(7,89);
    Calculater.multiply(31,26);
    Calculater.modulus(35,16);
    Calculater.sin(35);
    Calculater.sin(57);
    Calculater.sin(98);
            
        }
    }
    

