import java.util.*;
public class Primenumber {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);

        
    }
    public static void prime(int num){
        int count = 0;
        for (int i=1;i<=num;i++){
            if(num%i == 0){
                count += 1;
            }
        }
        if (count == 2){
           System.out.println(num +" is prime number"); 
        }
        else {
            System.out.println(num +" is composite number ");
        }
    }
}
