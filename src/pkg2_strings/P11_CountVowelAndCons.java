package pkg2_strings;

//TE:O(n)
public class P11_CountVowelAndCons {
    public static void main(String[] args) {
        String s = "Chhaya";
        String vowel = "aeiouAEIOU";
        int vowelCount = 0;
        int consCount = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) { //O(1)
                if (vowel.indexOf(ch) != -1)
                    vowelCount++;
                else
                    consCount++;

            }
        }
            System.out.println("Vowels: " + vowelCount + ", Consonants: "+consCount);
    }
}
