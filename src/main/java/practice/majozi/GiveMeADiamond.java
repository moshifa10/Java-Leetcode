package practice.majozi;

public class GiveMeADiamond {

    public static void main(String[] args){

        System.out.println(GiveMeADiamond.print(6));
    }

    public static String print(int n) {
        if (n <= 0){
            return null;
        }

        // n // 2

        int space = n/2;
        int stars = 1;

        int loop = n/2;
        StringBuilder diamond = new StringBuilder();

        for (int i= 0; i<loop +1; i++){
            for (int s= 0; s<space; s++){
                diamond.append(" ");
            }

            for (int star=0; star<stars; star++){
                diamond.append("*");
            }

            diamond.append("\n");
            space -=1;
            stars += 2;
        }
        space = 0;
        stars -=2;
        for (int i=0; i<loop; i++){

            space +=1;
            stars -=2;

            for (int s= 0; s<space; s++){
                diamond.append(" ");
            }

            for (int star=0; star<stars; star++){
                diamond.append("*");
            }
            diamond.append("\n");

        }

        return diamond.toString();
    }
}
