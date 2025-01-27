import java.util.*;
public class grade {
    public static void main(String[] args){
        System.out.println("Enter your Subject Marks:");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=80 && a<=100){
            System.out.println("Your Grade is A+");
        }
        else if(a>=75 && a<80){
            System.out.println("Your grade is A");
        }
        else if(a>=70 && a<75){
            System.out.println("Your Grade is A-");

        }
        else if(a>65 && a<70){
            System.out.println("Your Grade is B+");
        }
        else if(a>=60 && a<=64){
            System.out.println("Your Grade is B");
        }
        else if(a>=55 && a<60){
            System.out.println("Your Grade is B-");
        }
        else if(a>=50 && a<55){
            System.out.println("YOur Grade is C+");
        }
        else if(a>=45 && a<50){
            System.out.println("Your Grade is C-");
        }
        else if(a>=40 && a<45){
            System.out.println("YOur Grade is D");
        }
        else if(a>=0 && a<40){
            System.out.println("Your Grade is F");
        }
        else{
            System.out.println("Invalid Marks");
        }
    }
}
