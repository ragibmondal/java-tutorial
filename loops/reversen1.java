package loops;

public class reversen1 {
    public static  void main(String args[]){
        int n=10899;
        int rev=0;
        while(n>0){
            int lasts=n%10;
            rev=(rev*10)+lasts;
            n=n/10;
        }
        System.out.println(rev);
        
    }
}
