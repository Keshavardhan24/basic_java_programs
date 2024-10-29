import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter the operator");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' ||  op == '*' || op == '/' || op == '%' ){
                System.out.println("enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(op == '+'){
                    ans = a + b;
                }
                if (op == '-'){
                    ans = a - b;
                }
                if (op == '*'){
                    ans = a * b;
                }if (op == '/'){
                    ans = a / b;
                }if (op == '%'){
                    ans = a % b;
                }

            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("inavalid operator");
            }
            System.out.println(ans);

        }
    }

    
}
