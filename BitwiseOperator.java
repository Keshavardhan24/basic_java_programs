public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(AndOperator(a));
    }

    public static boolean AndOperator(int a){
        return (a & 1) == 1;
    }
}
