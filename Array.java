import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<arr.length;i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       sc.close();

    }
}
