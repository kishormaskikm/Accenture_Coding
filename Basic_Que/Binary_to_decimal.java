package Basic_Que;

public class Binary_to_decimal {
    public static void main(String[] args) {
        int ans = Binary_to_decimal(1010);
        System.out.println(ans);
    }
    public static int Binary_to_decimal(int n){
        int decimal = 0;
        int i = 0;
        while(n>0){
            int bit = n % 10;
            decimal = decimal + bit *  (int) Math.pow(2, i++);
            n /= 10;
        }
        return decimal;
    }

}
