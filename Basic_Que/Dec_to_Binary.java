package Basic_Que;
import java.util.*;

public class Dec_to_Binary {
    public static void main(String[] args) {
        int ans = decimaal_to_binary(10);
        System.out.println(ans);
    }
    public static int decimaal_to_binary(int n){
        int binaryNo = 0;
        int i = 0;
        while(n>0){
            int bit = n % 2;
            binaryNo = binaryNo + bit * (int) Math.pow(10, i++);
            n = n/2;
        }
        return binaryNo;
    }

}
