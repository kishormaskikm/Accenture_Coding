package Aceenture;

public class MoveHypenString {
    public static void main(String[] args) {
        String sample = "kishor-maski";
        System.out.println(moveHyphen(sample,sample.length()));
    }
    public static String moveHyphen (String str, int n)
    {
        String res = "";
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == '-')
                res = str.charAt (i) + res;
            else
                res = res + str.charAt (i);
        }
        return res;
    }
}
