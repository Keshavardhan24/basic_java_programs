public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int search = 6;
        int index =0;
        boolean ans =linearSearch(arr, search, index);
        System.out.println(ans);
        int ind = linearSearchint(arr, search, index);
        System.out.println(ind);
    }

    public static boolean linearSearch(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index+1);
    }

    public static int linearSearchint(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return linearSearchint(arr, target, index+1);
        }
       
    }
}
