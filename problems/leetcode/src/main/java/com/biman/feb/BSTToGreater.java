package com.biman.feb;

public class BSTToGreater {


  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public TreeNode(int val) {
      this.val = val;
    }

    public TreeNode() {}
  }

  int sum = 0;
  public TreeNode convertBST(TreeNode root) {
    if(root == null) {
      return null;
    }
    convertBST(root.right);
    sum += root.val;
    root.val = sum;
    convertBST(root.left);
    return root;
  }
}
