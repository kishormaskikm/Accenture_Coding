package Aceenture;

public class ReplaceCharector {
    public static void main(String[] args) {
        String str = "apple";
        System.out.println(replaceChar(str,str.length(),'a','p'));
    }
    public static String replaceChar(String str ,int n , char ch1, char ch2){

        //checks
        if(n<=0){
            return null;
        }
        if(ch1==ch2){
            return str;
        }
        String res = "";
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == ch1){
                res = res + ch2;
            } else if (str.charAt(i) == ch2) {
                res = res + ch1;
            }else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }

}
