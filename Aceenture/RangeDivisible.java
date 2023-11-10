package Aceenture;

public class RangeDivisible {

    public static void main(String[] args) {
        System.out.println(calculate(100,160));
    }
    public static int calculate(int n , int m){
        int sum = 0;
        for(int i = n ; i<=m; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

}
