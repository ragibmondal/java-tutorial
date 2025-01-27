import java.util.*;

public class cgpa {
    public static void main(String[] args){
    System.out.println("Enter your Subject Number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    float[] arr=new float[a];
    float[] arr1=new float[a];
    float sum=0;
    float credit=0;
    for(int i=0;i<a;i++){
    System.out.println("Enter your Subject "+(i+1)+" Grade: 4,3.45 etc");
    arr[i]=sc.nextFloat();
    System.out.println("Enter your Subject "+(i+1)+" Credit Hours: 3,2,1.5 etc");
    arr1[i]=sc.nextFloat();
    sum+=arr[i]*arr1[i];
    credit+=arr1[i];

}
   float cg=sum/credit;
   System.out.println("Your CGPA is: %.2f%n"+cg);
}
}