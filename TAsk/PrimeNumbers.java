public class PrimeNumbers{
    public static void main(String args[]){
        int a=50;
        for(int i=2;i<=50;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
               System.out.println(i);
        }
    }

    }
}

