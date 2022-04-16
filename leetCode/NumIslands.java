import java.util.LinkedList;
import java.util.Queue;

/*
 * @Author: Rooter
 * @Date: 2022-04-16 21:58:55
 * @LastEditors: Rooter
 * @LastEditTime: 2022-04-16 22:58:51
 */
/**
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
* 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class NumIslands {
    public static int numIslands(char[][] grid){
        //判断特解
        if(grid == null || grid.length == 0){
            return 0;
        }

        int num_islands = 0; //初始化岛屿数量为0
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]=='1'){
                    num_islands++;  //第一次遍历时，遇到第一个 1 时可以直接加1
                    grid[i][j] = '0'; //遍历过的标为0，防止广度遍历时再算入子节点

                    Queue<int[]> neighbour = new LinkedList<>();
                    neighbour.add(new int[]{i,j});
                    while(!neighbour.isEmpty()){
                        int[] cur = neighbour.poll();
                        
                        //@TODO
                        //根据现有节点，遍历上下左右四个节点，如果为1加入list中，并置为0
                    }
                }
            }
        }

        return num_islands;
    }
    public static void main(String[] args) {
        
    }
}