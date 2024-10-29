public class Pattern1 {
    public static void main(String[] args) {
       // pattern1();
       // pattern2();
        //pattern3();
        pattern5();
        
        
    }

    public static void pattern1(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }

    public static void pattern2(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
    public static void pattern3(){
        for (int i = 0; i < 5; i++) {
            for (int j =0; j<=5-i-1; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
    public static void pattern4(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
            
        }
    }
    public static void pattern5(){
        int n = 5;
        for (int i = 0; i <2*n; i++) {
            int colinrow = i > n ? 2*n-i-1 : i;
            for (int j = 0; j < colinrow; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
    
}
