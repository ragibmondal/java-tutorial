package condition;
import java.util.*;
public class com {
    public static void main(String args[]){
        //comparing three number 
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>=b)&&(a>=c)){
            System.out.println("A is grater than B  and c");
        }
        else if(b>=c){
            System.out.println("B is greater than C and a");
        }
        else{
            System.out.println("C is greater than a and b");
        }
    }
}
