import java.util.Scanner;
public class OcurrenceOfCharater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int count = 0;
        int input = sc.nextInt();
        //int search = sc.nextInt();
        sc.close();
        while (input>0) {
            
        int rem = input % 10;
        System.out.print(rem);
        input = input/10;
    }
       
        //System.out.println("Count is"+count);
    }
}
