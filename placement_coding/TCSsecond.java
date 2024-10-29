package placement_coding;
import java.util.*;
public class TCSsecond {
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter no of test cases");
        ArrayList <Integer> l1 = new ArrayList<Integer>();
        ArrayList <Integer> l2 = new ArrayList<Integer>();

        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("enter number at position "+ i+" :");
            int k = sc.nextInt();
            if(k<0){
                System.out.println("negative numbers not accepted");
                continue;
            }
            else{
                //System.out.println(k);
                l1.add(k);
            }

        }
        for(int i=0;i<l1.size();i++){
            int element = l1.get(i);
            int temp = element;
            int sum =0;
            while(temp>0){
                int digit = temp%10;
                int facto = fact(digit);
                sum = sum + facto;
                temp = temp/10;

            }
            if(sum==element){
                l2.add(element);
            }
        }


        
            System.out.println(l2);
        
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
