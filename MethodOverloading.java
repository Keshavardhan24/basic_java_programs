public class MethodOverloading {
    public static void main(String[] args) {
        Overload(50);
        Overload("Keshavardhan Reddy");
        
    }
    public static void Overload(int a){
        System.out.println(a);
    }
    public static void Overload(String name){
        System.out.println(name);
    }
}
