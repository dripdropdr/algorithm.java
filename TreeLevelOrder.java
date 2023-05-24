/* 
    https://www.hackerrank.com/challenges/tree-level-order-traversal/problem?isFullScreen=true
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[1024];
        
        q.add(root);
        while(!q.isEmpty()){
            Node tmp = q.poll();
            System.out.print(tmp.data+" ");
            if (tmp.left != null) q.add(tmp.left);
            if (tmp.right != null) q.add(tmp.right);
        }
      
    }
