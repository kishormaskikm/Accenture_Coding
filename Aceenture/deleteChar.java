package Aceenture;

public class deleteChar {
    public static String delete_Char(String str){
        StringBuilder sb = new StringBuilder(str);

        boolean removed = true;
        while (removed) {
            removed = false;
            int i = 0;
            while (i < sb.length() - 1) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    removed = true;
                } else {
                    i++;
                }
            }
        }

        if (sb.length() == 0) {
            return "Empty string";
        } else {
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        String str = "aabaabba";
        System.out.println(delete_Char(str));
    }
}
