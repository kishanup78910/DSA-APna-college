public class MaxSumPrefix {
    public static void maxSum(int[] arr) {

        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        // Compute prefix sums
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
            System.out.println("p "+prefixSum[i]);
        }

        int max = Integer.MIN_VALUE;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Calculate sum of subarray arr[i...j]
                int sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                System.out.println(sum);
                max = Math.max(max, sum);
                System.out.println(max);
            }
        }

        System.out.println("Maximum sum of subarray is " + max);
    


}
    public static void main(String[] args) {

        int[] arr = {1, -2, 6, -1, -8};
        maxSum(arr);
        
    }
}
