package pkg2_strings;

public class P2_CountWord {
    public static void main(String[] args) {
        countWord("   Hello    Chhaya   ");//expected op:2
    }

    private static void countWord(String s) {
        s=s.trim();
        String[]arr = s.split("\\s+");
        System.out.println(arr.length);
    }
}
