import java.util.Scanner;
public class temperatureconversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter temperature in Celsius ");
        float c = sc.nextFloat();
        float f = c* 9/5 + 32;
        System.out.println("temperatre in farhen heat is "+ f);
        sc.close();
    }
}
