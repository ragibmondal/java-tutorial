import java.util.Scanner;

public class salary {
    public static void main(String[] args){
        System.out.println("Enter your Salary:");
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        if(a>5000){
            System.out.println("Your Bonas is"+ a*0.10);
        }
        else{
            System.out.println("Bonas is :"+a*0.05);
        }
    }
}
