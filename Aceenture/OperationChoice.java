package Aceenture;

public class OperationChoice {
    public static void main(String[] args) {
        System.out.println(basicCalci(2,20,10));
    }
    public static int basicCalci(int c , int a , int b){
        if(c == 1){
            return a+b;
        } else if (c == 2) {
            return a-b;
        } else if (c == 3) {
            return a*b;
        } else if (c == 4) {
            return a/b;
        }else {
            return -1;
        }
    }

}
