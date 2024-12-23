public class BinarySearch {

    public static int BinarySearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
               mid=(low+high)/2;
              if(arr[mid]==target){
                  return mid;
              }
              if(arr[mid]>target){
                high=mid-1;
              }
             else
              low = mid+1;

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {3,66,98,100};
        int target = 66;
        int result = BinarySearch(arr, target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+result);
        }
    }
}
