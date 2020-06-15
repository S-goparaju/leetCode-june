*/Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

For example, 

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2     
     / \   
    1   3
In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root==null || val==root.val) return root;
        
        return val < root.val ? searchBST(root.left,val) : searchBST(root.right,val);
        
    }
}


*/ Since it is a binary tree we know that left child nodes are always lesser than root values and right child nodes 
** are always greater than root value therefore we use recursion here if the value is lesser than root we pass left node 
*** and vice versa.
*/

*/ Time complexity is O(H) h is the height of Tree O(log N) - average case O(N) - worst case
** Space complexity is O(H) to keep the recursion stack "" average and worst
/*
