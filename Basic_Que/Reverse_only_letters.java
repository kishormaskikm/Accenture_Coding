package Basic_Que;
//https://leetcode.com/problems/reverse-only-letters/
public class Reverse_only_letters {
    public static String reverseOnlyLetters(String s) {
        int l = 0;
        int h = s.length()-1;
        char[] chars = s.toCharArray(); // Convert the string to a character array
        while(l<h){
            if(Character.isAlphabetic(s.charAt(l)) && Character.isAlphabetic(s.charAt(h))){
                char temp = chars[l];
                chars[l] = chars[h];
                chars[h] = temp;
                l++;
                h--;
            } else if (!Character.isAlphabetic(s.charAt(l))) {
                l++;
            }else{
                h--;
            }
        }
        // Create a new string from the modified character array
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "kishor&maski";
        String ans = reverseOnlyLetters(input);
        System.out.println(ans);
    }
}
