package Basic_Math;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 2 ; i<n; i++){
            if(i%n == 0) {
                System.out.println("Not prime");
            }
        }
        System.out.println(" prime");
    }
}
