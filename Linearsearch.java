import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter search element");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search){
                System.out.println("element found at "+i);
            }
        
        }
        
    }
    
}
