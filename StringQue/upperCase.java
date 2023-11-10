package StringQue;

//convert given string into upper case
public class upperCase {
    public static void main(String[] args) {
        String str = "kishor";
//        System.out.println(str.toUpperCase()); // Inbuilt function

        //manually
        String ans = "";
        for(int i = 0; i<str.length(); i++){
            char ch = (char) (str.charAt(i) - 'a' + 'A');
            ans += ch;
        }
        System.out.println(ans);


        //for Lower Case
        String str2 = "KISHOR";
//        System.out.println(str.toLowercase()); // Inbuilt function

        //manually
        String ans2 = "";
        for(int i = 0; i<str2.length(); i++){
            char ch = (char) (str2.charAt(i) - 'A' + 'a');
            ans2 += ch;
        }
        System.out.println(ans2);

    }
}
