package loops;
import java.util.*;

public class reversen {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter the number u want to Reverse:");
  n=sc.nextInt();
  while(n>0){
  int lastd=n%10;
  System.out.print(lastd);
  n=n/10;

  }  
}
}
