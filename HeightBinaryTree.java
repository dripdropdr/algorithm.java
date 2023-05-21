public static int height(Node root) {
      	/*
        * The problem of find height of binary tree.
        * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
        */
          
        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null){
        leftHeight = 1 + height(root.left);
        }
        if (root.right != null){
        rightHeight = 1 + height(root.right);
        }
        if (leftHeight >= rightHeight) return leftHeight;
        else return rightHeight;
    }
