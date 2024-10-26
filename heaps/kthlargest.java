import java.util.*;

class kthlargest {
    // PriorityQueue to store the k largest elements
    static PriorityQueue<Integer> minHeap;
    // The value of k (k-th largest element)
    static int k;

    // Function to process the array and get the k-th largest element at each step
    static List<Integer> getAllKthNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // Process each element of the array
        for (int val : arr) {
            // If the heap has fewer than k elements, add the current element
            if (minHeap.size() < k) {
                minHeap.add(val);
            } else {
                // If the heap has k elements, check if the current element is larger than the smallest
                if (val > minHeap.peek()) {
                    minHeap.poll();   // Remove the smallest element
                    minHeap.add(val); // Add the current element
                }
            }

            // If the heap has k elements, add the k-th largest element to the result
            if (minHeap.size() >= k) {
                list.add(minHeap.peek());
            } else {
                // If the heap has fewer than k elements, add -1 to the result
                list.add(-1);
            }
        }
        return list;
    }

    // Main function
    public static void main(String[] args) {
        // Initialize the min-heap and k
        minHeap = new PriorityQueue<>();
        k = 4;

        // Input array
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // Get the k-th largest element at each step
        List<Integer> res = getAllKthNumber(arr);

        // Print the result
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
