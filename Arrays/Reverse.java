public class Reverse {

    public static void reverse(int []arr){
        for(int i=0;i<arr.length/2;i++){
             int temp = arr[i];
             arr[i]=arr[arr.length-1-i];
             arr[arr.length-1]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {4,6,7,20};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
