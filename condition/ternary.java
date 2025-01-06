package condition;
import java.util.*;
public class ternary {
   public static void main(String args[]){
    int number=2008;
    Scanner sc= new Scanner(System.in);
    //variable= condition?statement1 :statement 2
    //int  large =(5>3)?5:3;
    //System.out.println(large);
    String type=(number%2)==0?"even":"Odd";
    System.out.println(type);


   } 
}
