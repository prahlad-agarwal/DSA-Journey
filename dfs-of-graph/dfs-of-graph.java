import java.util.*;

class Solution {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            // code here
            int vertices = adj.size();
            boolean[] visited = new boolean[vertices];

            this.res = new ArrayList<>();
            this.adjacencyList = adj;

            DFS(0, visited);
            return res;
        }

        private void DFS(int node, boolean[] visited) {
            visited[node] = true;
            res.add(node);

            for (int neighbor : adjacencyList.get(node)) {
                if (!visited[neighbor]) {
                    DFS(neighbor, visited);
                }
            }
        }
    }