public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        int sol = fibo(num);
        System.out.println(sol);

    }
    public static int fibo(int n){
        if(n<=1){
            return 1;
        }
        return n*fibo(n-1);

    }
}
