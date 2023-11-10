package Basic_Que;

public class Merge_two_string {
    public static String mergeAlternately(String word1, String word2) {
        int len = word1.length() + word2.length();
        String ans = "";
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);
            ans += ch1;
            ans += ch2;
            i++;
            j++;
        }

        while (i < word1.length()) {
            char ch = word1.charAt(i);
            ans += ch;
            i++;
        }

        while (j < word2.length()) {
            char ch = word2.charAt(j);
            ans += ch;
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "pqrst";
        String ans = mergeAlternately(a,b);
        System.out.println(ans);
    }
}
