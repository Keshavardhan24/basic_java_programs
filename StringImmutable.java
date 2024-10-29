public class StringImmutable {
    public static void main(String[] args) {
        String name = "keshu reddy";
        String name2 = "keshu reddy";
        System.out.println(name == name2);

        String name3 = new String("Keshu");
        String name4 = new String("Keshu");
        System.out.println(name3.equals(name4));
    }
}
