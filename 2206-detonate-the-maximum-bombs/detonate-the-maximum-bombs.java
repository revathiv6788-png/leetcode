class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;

        // Step 1: Create graph (adjacency list)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Step 2: Build graph using distance formula
        for (int i = 0; i < n; i++) {
            long x1 = bombs[i][0], y1 = bombs[i][1], r1 = bombs[i][2];

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                long x2 = bombs[j][0], y2 = bombs[j][1];

                long dx = x1 - x2;
                long dy = y1 - y2;

                // Check if j is within i's radius
                if (dx * dx + dy * dy <= r1 * r1) {
                    graph.get(i).add(j);
                }
            }
        }

        // Step 3: Try DFS from each bomb
        int max = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            max = Math.max(max, dfs(i, graph, visited));
        }

        return max;
    }

    private int dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        int count = 1;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                count += dfs(nei, graph, visited);
            }
        }

        return count;
    }
}