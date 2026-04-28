package practice.majozi;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationTable {

//    [[1,2,3],[2,4,6],[3,6,9]] = 1

    public static void main(String[] args){

        System.out.println(Arrays.deepToString(MultiplicationTable.multiplicationTable(3)));
        System.out.println(Arrays.deepToString(MultiplicationTable.multiplicationTable(1)));

    }

    public static int [][] multiplicationTable(int n){
        int[][] table = new int[n][n];

        for (int i = 1; i <= n; i++){
            int[] save = new int[n];
            for (int j = 1; j<n+1; j++){
                save[j-1] = i*j;
            }
            table[i-1] = save;
        }
        return table;
    }
}
