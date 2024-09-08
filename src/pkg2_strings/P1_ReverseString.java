package pkg2_strings;

public class P1_ReverseString {
    public static void main(String[] args) {

        reverse("Chhaya");
    }


    private static void reverse(String s) {
        System.out.println("Original String: " + s);

        //Using loop
        String rev = "";
        for (int i=s.length()-1; i>=0; i--){
            rev+=s.charAt(i);
        }
        System.out.println( "Reversed String: " + rev);

        //Using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println( "Reversed String: " + sb.reverse());

        //Using StringBuffer
        StringBuffer sbfr = new StringBuffer(s);
        System.out.println( "Reversed String: " + sbfr.reverse());

    }
}
