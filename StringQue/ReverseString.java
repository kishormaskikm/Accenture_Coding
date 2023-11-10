package StringQue;

import java.util.Arrays;


// we cannot reverse a string directly because string in java are Imutable , Although we can use StringBuilder for reverse a string
public class ReverseString {
    public static void main(String[] args) {
        String str = "kishor";
        char[] ch=str.toCharArray();

        reverseString(ch);
    }

    private static void reverseString( char[] ch) {
        // two pointer method
        int len = ch.length;
        int i = 0;
        int j = len-1;

        while (i<=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
        String ans = new String(ch);
        System.out.println(ans);
    }
}
