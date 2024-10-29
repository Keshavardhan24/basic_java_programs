import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a>b && a>c){
            System.out.println("The largest number is "+ a);
        }
        else if (b>a && b>c){
            System.out.println("The largest number is "+ b);
        }
        else {
            System.out.println("the largest number is "+ c);
        }
    }
}
