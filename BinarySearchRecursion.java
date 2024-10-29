public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,55,66,77};
        int target = 77;
        System.out.println(BinarySearch(a, target, 0, a.length-1));
    }
    static int BinarySearch (int[] a , int target , int start , int end){
        
        if(start >  end){
            return -1;
        }
        int mid = (start + end )/2;
        if (a[mid] == target){
            return mid;
        }
        if(target < a[mid]){
             return BinarySearch(a, target, start, mid-1);
        }
       
        return BinarySearch(a, target, mid+1, end);
        

        }
    }

