import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[adj.size()];

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            int curr = q.remove();
            ans.add(curr);

            
            for(int i : adj.get(curr)) {
                if(!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        return ans;
    }
}