package variabledatastructure;
import java.util.*;


public class ppe {
    public static void main(String args[]){
        //pen,pencil,eraser
        float p,pp,e,sum;
        Scanner sc=new Scanner(System.in);
        p=sc.nextFloat();
        pp=sc.nextFloat();
        e=sc.nextFloat();
        sum=p+pp+e;
        //add on with 18% tax;
        float tax=(0.18f*sum);
        float total=sum+tax;

        System.out.println(total);   


    }
}
