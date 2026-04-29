package practice.majozi;

public class FindOutlier {

    public static void main(String[] args){

        System.out.println(FindOutlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println(FindOutlier.find(new int[]{160, 3, 1719, 19, 11, 13, -21}));
    }

    static int find(int[] integers) {
        int countOdd = 0;
        int countEven = 0;

        for (int i : integers){
            if (i%2==0){
                if (countOdd >1){
                    return i;
                }
                countEven += 1;
            }

            else {
                if(countEven > 1){
                    return i;
                }
                countOdd += 1;
            }
        }
        if (countOdd > 1){
            if(integers[0] % 2 ==0){
                return integers[0];
            } else if (integers[1] % 2 ==0) {
                return  integers[1];
            }
            else {
                return integers[2];
            }
        }else {
            if(integers[0] % 2 !=0){
                return integers[0];
            } else if (integers[1] % 2 !=0) {
                return  integers[1];
            }
            else {
                return integers[2];
            }
        }
    }
}