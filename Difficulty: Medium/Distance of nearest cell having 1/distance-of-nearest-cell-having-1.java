import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

      
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1) {
                    q.add(new int[]{i, j});
                    vis[i][j] = true;
                }

        int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = cur[0] + dx[k], y = cur[1] + dy[k];
                if (x >= 0 && y >= 0 && x < n && y < m && !vis[x][y]) {
                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
                    vis[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int[] row : dist) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int val : row) temp.add(val);
            ans.add(temp);
        }
        return ans;
    }
}