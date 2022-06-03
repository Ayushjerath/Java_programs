public class Celebrity_Ptoblem {
    public static void main(String[] args) {
        int graph[][] ={ {0, 0, 1, 0},
                         {0, 0, 1, 0},
                         {0, 0, 0, 0},
                         {0, 0, 1, 0}};         
        
        // int graph[][] ={{0, 0, 1, 0, 0},
        //                  {0, 0, 0, 1, 0},
        //                  {0, 0, 0, 0, 0},
        //                  {0, 0, 1, 0, 0},
        //                  {0, 0, 1, 0 ,0}};

        int cel = -1; 
        int n = graph.length;
        int out[] = new int[n];
        int in[] = new int[n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(graph[i][j] == 1){
                    out[i] += graph[i][j];
                    in[j] += graph[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (in[i] == n - 1 && out[i] == 0){
                cel = i;
            }
        }
 
        if(cel == -1){
            System.out.println("Celebrity does not exist");
        }
        else{

            System.out.println("Celebrity : - " + cel);
        }
    }
}