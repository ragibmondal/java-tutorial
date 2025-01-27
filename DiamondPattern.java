public class DiamondPattern {
    public static void main(String[] args) {
        int lines = 4;
        
        for (int i = 0; i < lines; i++) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Stars before @
            for (int j = 0; j < (3 - i); j++) {
                System.out.print("*");
            }
            
            System.out.print("@");
            
            // Stars after @
            for (int j = 0; j < (3 - i); j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}