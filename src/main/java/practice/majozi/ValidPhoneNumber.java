package practice.majozi;

public class ValidPhoneNumber {

    public static void main(String[] args){
        System.out.println(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(999) 000-0000"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(123)456-7890"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(123) 456 7890"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("1 (123) 456-7890"));

        System.out.println(ValidPhoneNumber.validPhoneNumber("(123) 456-78f0"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(123) 4e6-7890"));
        System.out.println(ValidPhoneNumber.validPhoneNumber("(*23) 456-7890"));
    }

    public static boolean validPhoneNumber(String phoneNumber){
        boolean space = phoneNumber.contains(" ");
        boolean dash = phoneNumber.contains("-");
        boolean openB = phoneNumber.contains("(");
        boolean closeB =  phoneNumber.contains(")");

        if (!(space && dash && openB && closeB)){
            return false;
        }

        String regex = "[- ]";
        String[] splitted = phoneNumber.split(regex);
        int[] numbers = {5, 3, 4};

        for (char c : phoneNumber.toCharArray()){
            if(c == '(' || c==')' || c=='-' || c==' '){
                continue;
            }
            if ((!Character.isLetter(c) && !Character.isDigit(c))){
                return false;
            }

            if (Character.isLetter(c) && !Character.isDigit(c)){
                return false;
            }
        }

        // (123) 456-7890
        for (int i = 0; i < splitted.length; i++){
            if (splitted[i].length() != numbers[i]){
                return false;
            }
        }
        return true;
    }
}
