import java.io.*;
 
class GFG {
 
    // Function to find the maximum alternating
    // sum of a subarray for the given array
    public static int alternatingSum(int[] arr)
    {
        int sum = 0;
        int sumSoFar = 0;
 
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
 
            // Store sum of subarrays
            // starting at even indices
            if (i % 2 == 1) {
 
                sumSoFar -= arr[i];
            }
            else {
 
                sumSoFar = Math.max(
                    sumSoFar + arr[i], arr[i]);
            }
 
            // Update sum
            sum = Math.max(sum, sumSoFar);
        }
 
        sumSoFar = 0;
 
        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
 
            // Store sum of subarrays
            // starting at odd indices
            if (i % 2 == 0) {
                sumSoFar -= arr[i];
            }
            else {
                sumSoFar = Math.max(
                    sumSoFar + arr[i], arr[i]);
            }
 
            // Update sum
            sum = Math.max(sum, sumSoFar);
        }
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        // Given Input
        int arr[] = new int[] { -4, -10, 3, 5 };
 
        // Function call
        int ans = alternatingSum(arr);
 
        System.out.println(ans);
    }
}
