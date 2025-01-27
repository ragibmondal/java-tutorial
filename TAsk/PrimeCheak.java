import java.util.*;
public class PrimeCheak{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number u want to cheak is it prime or not': ");
    int a=sc.nextInt();
    boolean isPrime=true;
    if(a<2){
      isPrime=false;
    }
    else{
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
            isPrime=false;
            break;
            }
        }
    }
    if(isPrime) System.out.println(a + " is a prime Number");
    else System.out.println(a+ "is not a prime Number");

}
}