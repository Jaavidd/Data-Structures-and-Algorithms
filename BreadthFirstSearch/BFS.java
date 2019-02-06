import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BFS {

   static  int[] dr={-1,1,0,0};
   static int[] dc={0,0,1,-1};

   static  Queue<Integer> RowQueue=new LinkedList<Integer>();
   static Queue<Integer> ColumnQueue=new LinkedList<Integer>();

    static   int[][] visited;

    static   int node_left=1;
    static int node_next=0;
    static int rr = 0, cc = 0;

    static void Neighboors(int[][] matrix,int r,int c) {

        visited=new int[matrix.length][matrix[0].length];


        for (int i = 0; i < 4; i++) {
            rr = r + dr[i];
            cc = c + dc[i];

            if (rr < 0 || cc < 0) continue;
            if (rr >= matrix.length || cc >= matrix[0].length) continue;


           if(visited[rr][cc]==1) continue;
          if(matrix[rr][cc]=='*') continue;

           RowQueue.add(rr);
           ColumnQueue.add(cc);
           visited[rr][cc]=1;
           node_next++;


        }
    }

       static int find(int[][] matrix,int source,int source1)
       {
           int steps=0;

           boolean finish=false;




             RowQueue.add(source);
             ColumnQueue.add(source1);


             int temp1=0,temp2=0;

             while(RowQueue.size()>0)
             {
                 temp1=RowQueue.remove();
                 temp2=ColumnQueue.remove();

                 if(matrix[temp1][temp2]=='t')
                 {
                     finish=true; break;
                 }
                 Neighboors(matrix,temp1,temp2);
                 node_left--;
                 if(node_left==0)
                 {
                     node_left=node_next;
                     node_next=0;
                     steps++;
                 }


             }
           if(finish) return steps;



           return -1;
       }










    public static void main(String[] args) {
        int[][] matrix = {{'*', '*', '*', '*'},
                         {'0', '0', 's', '0'},
                         {'0', '0', '*', '0'},
                         {'*', '0', '0', '0'},
                         {'0', '0', '0', '0'},
                         {'*', '0', '0', '*'},
                         {'0', '0', '*', '*'},
                         {'0', '*', 't', '*'},
                         {'0', '0',  '0','0'} };


  int row=0;
  int column=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 's') {
                    row=i;
                    column=j;
                    break;
                }
            }
        }
  // System.out.print(row+" "+column);


   System.out.print("Shortest Path = "+find(matrix,row,column));

    }
}
