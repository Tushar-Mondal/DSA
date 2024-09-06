package Strings;
import java.util.*;
public class Maze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row size:");
        int row = in.nextInt();
        System.out.print("Enter col size:");
        int col = in.nextInt();
        int x = count(row, col);
        System.out.println(x);
        path("", row, col);
        ArrayList<String> ans = pathRet("", row, col, new ArrayList<>());
        System.out.println(ans);
        pathDiagonal("", row, col);
        ArrayList<String> list = pathRetDiagonal("", row, col, new ArrayList<>());
        System.out.println(list);
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        pathRestriction("", 0, 0, maze);
        ArrayList<String> list1 = pathRetRestriction("", 0, 0, maze, new ArrayList<>());
        System.out.println(list1);
        allPath("", 0, 0, maze);
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", 0, 0 , maze, path, 1);
    }
    static int count(int r, int c){
        if(r == 1 || c ==1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }
    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p + 'D', row - 1, col);
        }
        if(col > 1){
            path(p + 'R', row, col - 1);
        }
    }
    static ArrayList<String> pathRet(String p, int row, int col, ArrayList<String> list){
        if(row == 1 && col == 1){
            list.add(p);
            return list;
        }
        if(row > 1){
            pathRet(p + 'D', row - 1, col, list);
        }
        if(col > 1){
            pathRet(p + 'R', row, col - 1, list);
        }
        return list;
    }
    static void pathDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1 && col > 1){
            pathDiagonal(p + 'D', row - 1, col - 1);
        }
        if(row > 1){
            pathDiagonal(p + 'V', row - 1, col);
        }
        if(col > 1){
            pathDiagonal(p + 'H', row, col - 1);
        }
    }
    static ArrayList<String> pathRetDiagonal(String p, int row, int col, ArrayList<String> list){
        if(row == 1 && col == 1){
            list.add(p);
            return list;
        }
        if(row > 1 && col > 1){
            pathRetDiagonal(p + 'D', row - 1, col - 1, list);
        }
        if(row > 1){
            pathRetDiagonal(p + 'V', row - 1, col, list);
        }
        if(col > 1){
            pathRetDiagonal(p + 'H', row, col - 1, list);
        }
        return list;
    }
    static void pathRestriction(String p, int row, int col, boolean[][] maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row < maze.length - 1){
            pathRestriction(p + 'V',row + 1, col, maze);
        }
        if(col < maze[0].length - 1){
            pathRestriction(p + 'H', row, col + 1, maze);
        }
        if(row < maze.length - 1 && col < maze[0].length - 1){
            pathRestriction(p + 'D', row + 1, col + 1, maze);
        }
    }
    static ArrayList<String> pathRetRestriction(String p, int row, int col, boolean[][] maze, ArrayList<String> list){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            list.add(p);
            return list;
        }
        if(row < maze.length - 1){
            pathRetRestriction(p + 'V', row + 1, col, maze, list);
        }
        if(col < maze[0].length - 1){
            pathRetRestriction(p + 'H', row, col + 1, maze, list);
        }
        if(row < maze.length - 1 && col < maze[0].length - 1){
            pathRetRestriction(p + 'D', row + 1, col + 1, maze, list);
        }
        return list;
    }
    static void allPath(String p, int row, int col, boolean[][] maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = !maze[row][col];
        if(row < maze.length - 1){
            allPath(p + 'D', row + 1, col, maze);
        }
        if(row > 0){
            allPath(p + 'U', row - 1, col, maze);
        }
        if(col < maze[0].length - 1){
            allPath(p + 'R', row, col + 1, maze);
        }
        if(col > 0){
            allPath(p + 'L', row, col - 1, maze);
        }
        maze[row][col] = !maze[row][col];
    }
    static void allPathPrint(String p, int row, int col, boolean[][] maze, int[][] path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = !maze[row][col];
        path[row][col] = step;
        if(row < maze.length - 1){
            allPathPrint(p + 'D', row + 1, col, maze, path, step + 1);
        }
        if(row > 0){
            allPathPrint(p + 'U', row - 1, col, maze, path, step + 1);
        }
        if(col < maze[0].length - 1){
            allPathPrint(p + 'R', row, col + 1, maze, path, step + 1);
        }
        if(col > 0){
            allPathPrint(p + 'L', row, col - 1, maze, path, step + 1);
        }
        path[row][col] = 0;
        maze[row][col] = !maze[row][col];
    }
}