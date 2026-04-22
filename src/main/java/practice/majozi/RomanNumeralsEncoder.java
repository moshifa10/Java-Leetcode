package practice.majozi;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanNumeralsEncoder {

    public static void main(String[] args){
        RomanNumeralsEncoder check = new RomanNumeralsEncoder();

//        System.out.println(check.solution(1));
//        System.out.println(check.solution(4));
//        System.out.println(check.solution(3));
//        System.out.println(check.solution(6));
        System.out.println(check.solution(14)); // XIV
        System.out.println(check.solution(19)); //XIX
        System.out.println(check.solution(39)); // XXXIX
        System.out.println(check.solution(40)); // XL
        System.out.println(check.solution(44)); // XLIV
        System.out.println(check.solution(149)); //CXLIX
        System.out.println(check.solution(1994)); //MCMXCIV
        System.out.println(check.solution(3999)); // MMMCMXCIX
    }

    public String solution(int n) {

        ArrayList<String> numerals = new ArrayList<>();
        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i=romanNumerals.length-1; i > -1; i--){

            // Expression
            int floor =  n / numbers[i];

            if (floor > 0){
                n -= (numbers[i] * floor);
                if (floor > 1){
                    for(int j = 0; j<floor; j++){
                        numerals.add(romanNumerals[i]);
                    }
                }
                else {
                    numerals.add(romanNumerals[i]);
                }
//                if (n == 0){
//                    return String.join("",numerals);
//                }
            }
        }
        return String.join("",numerals);
    }
}
