public class NoOfDigits{
    public static void main(String[] args) {
        int a = 889744;
        int base = 10;

        int ans = (int)(Math.log(a)/Math.log(base)) +1;
        System.out.println(ans);
    }
}