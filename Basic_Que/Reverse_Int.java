package Basic_Que;

public class Reverse_Int {
    public int reverse(int x) {
        int ans = 0;
        boolean isNeg = false;
        if(x <= Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            isNeg = true;
            x = -x;
        }
        while(x>=0){
            if(x > Integer.MAX_VALUE/10){
                return 0; // FOR HANDLING 4 BIT VALUE , LEARNED IT
            }
            int rem = x % 10;
            ans = ans * 10 + rem;
            x = x/10;
        }
        return isNeg ? -ans : ans;
    }
}