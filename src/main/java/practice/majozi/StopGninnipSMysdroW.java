package practice.majozi;

import java.util.ArrayList;

public class StopGninnipSMysdroW {


    public static void main(String[] args){

        StopGninnipSMysdroW stopGninnipSMysdroW = new StopGninnipSMysdroW();

        System.out.println(stopGninnipSMysdroW.spinWords("This is another test"));
    }

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] strings = sentence.split(" ");

        StringBuilder builder = new StringBuilder();
        ArrayList<String> arrayList= new ArrayList<>();

        for (int i = 0; i<strings.length; i++){
            if (strings[i].length() > 4){
                StringBuilder stringBuilder = new StringBuilder();
                for(int j = strings[i].length() -1; j>-1; j--){
                    stringBuilder.append(""+strings[i].charAt(j));
                }
                arrayList.add(stringBuilder.toString());
            }
            else {
                arrayList.add(strings[i]);
            }
        }

        return String.join(" ",arrayList);
    }
}
