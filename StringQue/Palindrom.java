package StringQue;

public class Palindrom {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrom(str));
    }

    private static boolean isPalindrom(String str) {

        if(str.length() ==0 || str == null){
            return true;
        }

        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
