package loops;
import java.util.*;

public class printn {
    public static void main(String args[]){
    int n;
    System.out.println("Enter the Number: ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int count =1;
    int sum=0;

    while(count<=n){
        //System.out.println(count);
        sum+=count;
        count++;
    }
    System.out.println(sum);
    }
}
