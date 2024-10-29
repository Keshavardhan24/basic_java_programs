public class IsPalindrome {
    public static void main(String[] args) {

        String name = "malayalam";
        boolean ans = palindrome(name);
        System.out.println(ans);

        
    }
    public static boolean palindrome(String word){
        word.toLowerCase();
        
        
        for (int i = 0; i <word.length() / 2; i++) 
            {
                char start = word.charAt(i);
                char end = word.charAt(word.length() - 1 -i);

                if (start != end){
                    return false;
                }
                
                
               
            }
            
        return true;

    }
}
