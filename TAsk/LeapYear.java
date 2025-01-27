public class LeapYear {
    public static void main(String args[]){
        int n=2025;
        if(n%4==0){
            if((n%100==0) && (n%400!=0)){
                System.out.println("This is not a leap year");
            }
            else{
                System.out.println("This is a leap Year");
            }
        }
        else{
          System.out.println("This is not a leap year");  
        }
    }
}