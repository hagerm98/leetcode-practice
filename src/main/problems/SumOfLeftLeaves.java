package main.problems;

public class SumOfLeftLeaves {

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    public static int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    public static int sumOfLeftLeaves(TreeNode root, boolean isLeft) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null && isLeft) {
            return root.val;
        }

        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }

    public static int sumOfLeaves(TreeNode root) {
         if (root == null) {
             return 0;
         }

         if (root.left == null && root.right == null) {
             return root.val;
         }

         return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }


    public static int sumTree(TreeNode root) {
         if (root == null) {
             return 0;
         }
         return root.val + sumTree(root.left) + sumTree(root.right);
    }
}
