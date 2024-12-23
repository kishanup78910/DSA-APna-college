public class Kadanes {

    public static void kadanes(int []arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize to smallest possible value
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Do not reset currentSum to 0 for all negatives; retain its value
            if (currentSum < 0) {
                currentSum = 0; // Reset only if subarray sum can improve
            }
        }
        System.out.println(maxSum);
        
    }
public static void main(String[] args) {
    int[] arr = {-10, -2, -30, -1, -23};
    kadanes(arr);
}
}
