class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Build adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList());
        }
        
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        
        // Handle multiple connected components
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                if(dfs(i, -1, adj, vis)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(int curr, int par, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[curr] = true;

        for(int neighbour : adj.get(curr)) {
            
            if(!vis[neighbour]) {
                if(dfs(neighbour, curr, adj, vis)) {
                    return true;
                }
            } else if(neighbour != par) {
                return true;
            }
        }

        return false;
    }
}