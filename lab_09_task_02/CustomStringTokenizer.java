/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_09_task_02;
import java.util.*;
/**
 *
 * @author Azka Malik
 */
public class CustomStringTokenizer  extends StringTokenizer
{
    String str;

    public CustomStringTokenizer(String str) {
        super(str);
        this.str = str;
    }
    
    public static void main(String[] args) 
    {
        CustomStringTokenizer c1 = new  CustomStringTokenizer("my name is azka1 malik");
        System.out.println(c1.countTokens());
         String s = "0123456789";
         System.out.println(s.charAt(0));
    }
    public int countTokens()
    {
       String[] array1 = str.trim().split(" ");
       String[] s = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
       int tokensCount = 0;
       int count;
       
       for(int i = 0; i<array1.length;i++)
       {
           boolean bo = true;
           for(int j = 0; j<s.length ; j++)
           {
               if(array1[i].contains(s[j]))
               {
                   
               }
          if(bo)
            {
                tokensCount++;
            }
           }
       }
       return array1.length;
        
}

}
