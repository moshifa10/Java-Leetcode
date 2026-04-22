package practice.majozi;


import java.util.HashMap;

//input   =  "Hello, World!"
//result  =  "1112111121311"
//
//input   =  "aaaaaaaaaaaa"
//result  =  "123456789101112"
public class NumericalsOfAString {

    public static void  main(String[] args){

//        System.out.println(NumericalsOfAString.numericals("NjabsN"));
//        System.out.println(NumericalsOfAString.numericals("Hello, World!"));

        // 11121111213112111131224132411122
        System.out.println(NumericalsOfAString.numericals("Hello, World! It's me, JomoPipi!"));
    }


    public static String numericals(String s) {
        //code here
//        System.out.println(s);
        HashMap<String, Integer> myHashMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();
//        s = s.toLowerCase();

        for (int i=0; i<s.length(); i++){

            if (myHashMap.get(""+s.charAt(i)) == null){
                builder.append("1");
                myHashMap.put(""+s.charAt(i), 1);
            }

            else {
                int value = myHashMap.get(""+s.charAt(i));
                builder.append(""+ (value+1));
                myHashMap.put(""+s.charAt(i), value+1);
            }
        }
        return builder.toString();
    }
}
