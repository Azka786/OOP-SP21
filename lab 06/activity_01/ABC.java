/*
 The following example demonstrates that static variables are common for all instances:
 */
package lab_06_activity_01_main;

/**
 *
 * @author Azka Malik
 */
public class ABC {
    static int var_1 = 37;
    String var_2;

    String obj_no;
    ABC(String var,String no){
        var_2 = var;
        obj_no = no;
    }
    ABC(int var1,String no){
        var_1=var1;
        obj_no = no;
    }
    public void get_string(){
        System.out.println(obj_no+" of type string "+" = "+var_2);
    }
    public void get_int(){
        System.out.println(obj_no+ " of type integer = "+var_1);
    }
}
