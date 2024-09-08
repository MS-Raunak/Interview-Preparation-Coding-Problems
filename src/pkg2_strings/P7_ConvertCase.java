package pkg2_strings;

public class P7_ConvertCase {
    public static void main(String[] args) {
        convertToCaps("chhaya");
        convertToSmall("CHHAYA");
        convertToFirstCap("chhAya");

        /**
         * ASCII CODE:
         * A = 65 => a = A+32
         * a=97 => A = a-32
         *
         * Similerly,
         * convert B into b => B + 32
         * convert m into M => m-32
         */
    }


    //Convert into capital
    private static void convertToCaps(String s) {
        String toCaps = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                char ch = (char) (s.charAt(i) -32);
                toCaps += ch;
            }
            else toCaps+= s.charAt(i);
        }

        System.out.println(toCaps);
    }

    //Convert string into small letter
    private static void convertToSmall(String s) {
        String toSmall = "";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char ch = (char) (s.charAt(i) + 32);
                toSmall +=ch;
            }
            else toSmall +=s.charAt(i);
        }
        System.out.println(toSmall);
    }

    //Convert into first cap
    private static void convertToFirstCap(String s) {
        String firstCap = "";

        for (int i=0; i<s.length(); i++) {
            if (i==0 && (s.charAt(i) >= 'a' && s.charAt(i) <='z')) {
                char ch = (char) (s.charAt(i) - 32);
                firstCap += ch;
            }
            else if ( i>0 && (s.charAt(i)>='A' && s.charAt(i)<= 'Z')){
                char ch = (char) (s.charAt(i) + 32);
                firstCap += ch;
            }
            else firstCap += s.charAt(i);
        }

        System.out.println(firstCap);
    }

}
