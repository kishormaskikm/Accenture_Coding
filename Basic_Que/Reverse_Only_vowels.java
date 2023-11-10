package Basic_Que;
//345- leetcode
public class Reverse_Only_vowels {
    public boolean isVowel(char chh){
        char ch = Character.toLowerCase(chh);
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' ;
    }
    public String reverseVowels(String s) {
        int l = 0 ;
        int h = s.length()-1;
        char[] chars = s.toCharArray();

        while(l < h){
            if(isVowel(chars[l]) && isVowel(chars[h])){
                char temp = chars[l];
                chars[l] = chars[h];
                chars[h] = temp;
                l++;
                h--;
            }else if(!isVowel(chars[l])){
                l++;
            }else{
                h--;
            }
        }
        return new String(chars);
    }
}
