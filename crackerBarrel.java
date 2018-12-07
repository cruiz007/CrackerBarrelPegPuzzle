
/*This is a list of possible moves in puzzle*/
public class crackerBarrel{
    private int[][] pList = { {0,1,3}, {0,2,5}, {1,3,6}, {1,4,8},
    {2,4,7}, {2,5,9}, {3,6,10}, {3,7,12}, {4,7,11}, {4,8,13},
    {5,8,12}, {5,9,14}, {3,4,5}, {6,7,8}, {7,8,9}, {10,11,12},
    {11,12,13}, {12,13,14} };
    private int[] barr = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* solver */
    public void solver(){
        int[] m;
        for(int i = 0; i < 18; i++){
            m = pList[i];
            int[] o = { m[2], m[1], m[0] };
            if(willMove(m)){
                move(m);
            }
            else if(willMove(o)){
                move(o);
            }
        }
    }//end 

    /* Move */
    public boolean willMove(int[] m){
        return (m[0] == 1 && m[1] == 1 && m[2] == 0);
    }

    /* move */
    public void move(int[] m){
        barr[m[0]] = 0;
        barr[m[1]] = 0;
        barr[m[2]] = 1;
    }  

    public int[] getBarr(){
        return barr;
    }

    /* main with driver functioin to start the solver */
    public static void main(String[] args){
        crackerBarrel c = new crackerBarrel();
        c.solver();
        int[] b = c.getBarr();
        for(int i = 0; i < 15; i++){
            System.out.print(b[i] + " ");
        }
    }
}