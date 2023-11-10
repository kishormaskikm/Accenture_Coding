package Aceenture;

public class tableAndSum {
    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
    public static int calculate(int n){
        int sum = 0;
        for(int i = n ; i<=n*10 ; i = i+n){
            System.out.print(i + " ");
            sum += i;
        }
        return sum;
    }
}
