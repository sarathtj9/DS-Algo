//time:O(M*N)

public class NumIslands {

    public static void main(String[] args) {

        NumIslands numIslands= new NumIslands();
        char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println("result :"+numIslands.countNumIslands(grid));
    }

    public int countNumIslands(char[][] grid)
    {
        if(grid==null || grid.length==0)
            return 0;
        int numIslands=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    numIslands+=dfs(grid,i,j);
                }
            }
        }
        return numIslands;
    }

    public int dfs(char[][] grid, int i, int j)
    {

        if(i<0 || i>=grid.length || j<0 || j>grid[i].length || grid[i][j]=='0')
            return 0;

        grid[i][j]='0';// not to visit the already visited islands
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;
    }
}
