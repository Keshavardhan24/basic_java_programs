import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  check = sc.nextInt();
        Armstrong(check);
        sc.close();
    }
    public static void Armstrong(int num){
        int sum=0;
        while (num>0){
            int rem = num%10;
            
            num = num / 10;
            sum = sum+(rem*rem*rem);
        }
        if (num == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
        

    }
}
