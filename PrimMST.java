class Result {

    /* The Prim problem in hackerrank
     * 
     * Complete the 'prims' function below.
     * https://www.hackerrank.com/challenges/primsmstsub/problem
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY edges
     *  3. INTEGER start
     */

    static class Edge implments Comparable<Edge>{
      int node;
      int weight;

      public Edge(int node, int weight){
        this.node = node;
        this.weight = weight;
      }
      
      # For PriorityQueue
      @Override
      pulibc int compareTo(Edge other){
        return Integer.compare(this.weight, other.weight);
      }
    }

    public static int prims(int n, List<List<Integer>> edges, int start) {
      # Graph initialization
      Map<Integer, List<Edge>> graph = new HashMap<>();
      for (int i=0; i<=n; i++){
        graph.put(i, new ArrayList<>());
      }

      for (List<Integer> edge: edges){
        int from = edge.get(0);
        int to = edge.get(1);
        int weight = edge.get(2);

        graph.get(from).add(new Edge(to, weight));
        graph.get(to).add(new Edge(from, weight));
      }
      
      # Prim algorithm start
      PriorityQueue<Edge> pq =  new PriorityQueue<>();
      boolean[] visited = new boolean[n + 1];
      int totalCost = 0;

      visited[start] = true;
      pq.addAll(graph.get(start));
      while (!pq.isEmpty()){
        Edge currentEdge = pq.poll();
        if (visited[currentEdge.node]) continue;

        visited[currentEdge.node] = true;
        totalCost += currentEdge.weight;
        
        for (Edge edge : graph.get(currentEdge.node)){
          if (!visited[edge.node]){
            pq.add(edge);
          } 
        }
      return totalCost;
      }
    }

}
