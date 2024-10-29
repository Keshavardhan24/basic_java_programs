public class LinearString {
    public static void main(String[] args) {
        String name = "Keshu";
        char ch = 'e';
        System.out.println(CheckChar(name , ch));


        
    }
    public static boolean CheckChar(String name , char ch){
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch){
                return true;
            }
            
        }
        return false;
    }
}
