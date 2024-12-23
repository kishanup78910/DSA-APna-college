class MaxSubArrayBruteForce {
    public static void SubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currentSum = 0; // Reset for each subarray
                
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        SubArray(arr);
    }
}
