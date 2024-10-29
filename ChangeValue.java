import java.util.Scanner;
public class ChangeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        
    }
    public static void sum(int num1 , int num2){
        int num3 = num1 + num2;
        System.out.println(num3);

    }
    
}
