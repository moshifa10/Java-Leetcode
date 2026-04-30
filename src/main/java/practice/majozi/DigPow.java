package practice.majozi;

public class DigPow {

    public static long digPow(int n, int p) {

        String s = Integer.toString(n);
        int sum = 0;
        int count = 0;

        for(char c: s.toCharArray()){
            sum += (int)Math.pow(Integer.parseInt(""+c), p+count);
            count++;
        }

        // your code
        if ((int)sum/(n) * n == sum){
            return (int)sum/(n);
        }
        return -1;
    }


    public static void main(String[] args){
        System.out.println(DigPow.digPow(89,1));
        System.out.println(DigPow.digPow(695, 2));
        System.out.println(DigPow.digPow(46288, 3));

    }
}