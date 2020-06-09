*/Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false;
        long x = (long) n;
        return (x & (-x))==x;
        // return (x&(x-1))==0;
    }
}
*/ Here we used binary operation for power of two if we observe there are some logic for suppose x and ~x-1 is equal to x 
and x and x-1 is equal to 0 so we used this logic here*/
*/ Time complexity and Space complexity is O(1)*/
