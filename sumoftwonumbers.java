import java.util.*;
public class sumoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int ans = sum(a,b);
        System.out.println(ans);
    }
    public static int sum(int a , int b){
        
        
        int c = a+b;
        return c;
        
    }
}