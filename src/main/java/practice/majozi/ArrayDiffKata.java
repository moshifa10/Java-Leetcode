package practice.majozi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiffKata {

    public static void  main(String[] args){

//        System.out.println(ArrayDiffKata.arrayDiff(new int[]{1, 2}, new int[]{{1}));
        System.out.println(Arrays.toString(ArrayDiffKata.arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();


        for (int i : a){
            integers.add(i);
        }
        for (int i : b){
            integers2.add(i);
        }
        ArrayList<Integer> containers = new ArrayList<>();

        for(int i: integers){
            if(!integers2.contains(i)){
                containers.add(i);
            }
        }
        int[] arr = new int[containers.size()];

        for(int i=0; i<containers.size(); i++){
            arr[i] = containers.get(i);
        }
        return arr;
    }


}
