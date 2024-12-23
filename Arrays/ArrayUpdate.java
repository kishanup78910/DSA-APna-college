
public class ArrayUpdate {

    public static void  update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+10;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("before update");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        update(arr);
        System.out.println("\nAfter update");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
