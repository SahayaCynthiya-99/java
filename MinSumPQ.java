/* Given an array of integers, perform some
number k of operations. Each operation
consists of removing an element from the
array, dividing it by 2 and inserting the
ceiling of that result back into the array.
Minimize the sum of the elements in the
final array.

Example:
nums = [10, 20, 7]
k = 4
Pick Pick/2 Ceiling Result
Initial array [10, 20, 7]
7 3.5 4 [ 10, 20, 4]
10 5 5 [5, 20, 4]
20 10 10 [5, 10, 4]
10 5 5 [5, 5, 4]
The sum of the final array is 5 + 5 + 4 = 14,
and that sum is minimal. */

import java.util.PriorityQueue;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] nums = {10, 20, 7};
        int k = 4;
        System.out.println("Minimal Sum: " + minSum(nums, k));
    }
    private static int minSum(int[] nums, int k) {
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<> (Collections.reverseOrder());

        for (int i=0; i<nums.length; i++) {
            maxheap.add(nums[i]);
        }

        for (int i=0; i<k; i++) {
            int max = maxheap.poll();
            maxheap.add((max + 1) / 2);
        }
        int sum = 0;
        while (!maxheap.isEmpty()) {
            sum += maxheap.poll();
        }
        return sum;
    } 
}