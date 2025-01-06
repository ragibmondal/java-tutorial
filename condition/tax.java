import java.util.*;
public class tax {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
    if(a<=500000){
        System.out.println("Income Tax is : "+a);
    }
    else if(a>=500000 && a<=1000000){
        float b=a+(a*0.20f);
        System.out.println("Income tax is: "+b);
    }
    else{
        float c=a+(a*0.30f);
        System.out.println("Income Tax is : "+c);
    }

    }
}
