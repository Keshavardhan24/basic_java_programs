import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int i;
        sc.close();
        for (i=2;i<=n;i++){
            
            int temp = b;
            b = b+a;
            a = temp;
            System.out.println(b);

        }
       
        
        
    }
}
