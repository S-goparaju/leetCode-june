/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int mid, left=0, right=nums.length-1;
        
        while(left<=right){
            mid = left + (right-left) /2;
            if(target==nums[mid]) return mid;
            if(target<nums[mid]) right=mid-1;
            else
                left = mid+1;
        }
        
        return left;
        
        
    }
}

/* for this type of problems like in a array find the target Binary Search is the best approach to implement so we search
for the target in middle if found we return or we change Two pointers accordingly if it is less we change end pointer to middle -1
and greater start pointer to middle +1 and if not found we can return left which will exactly where we should insert our target
*/

/* Time complexity O(log N)
** Space Complexity is O(1)
*/
