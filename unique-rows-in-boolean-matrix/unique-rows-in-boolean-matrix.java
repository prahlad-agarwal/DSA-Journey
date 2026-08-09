class Solution {

    static class Node {
        Node[] children = new Node[2];
        boolean endOfWord = false;
    }

    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node root = new Node();

        for (int i = 0; i < mat.length; i++) {

            Node curr = root;
            boolean isNew = false;

            for (int j = 0; j < mat[0].length; j++) {

                int val = mat[i][j];

                if (curr.children[val] == null) {
                    curr.children[val] = new Node();
                    isNew = true;
                }

                curr = curr.children[val];
            }

            // Entire row was already present
            if (!curr.endOfWord) {
                curr.endOfWord = true;

                ArrayList<Integer> row = new ArrayList<>();

                for (int val : mat[i]) {
                    row.add(val);
                }

                res.add(row);
            }
        }

        return res;
    }
}