public class Pattern04 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            int count =1;
            for (int j = 0; j < i+1; j++) {
                System.out.print(count+" ");
                count++;
                
                
            }
            System.out.println("");
        }
    }
}
