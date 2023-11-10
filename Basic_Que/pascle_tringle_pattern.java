package Basic_Que;

public class pascle_tringle_pattern {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 0; i < n ; i++){
            int c =1;
            for(int j =1; j<=i;j++){
                System.out.print(c + " ");
                c = c * (i-j)/j;  // formula for calculating uppers adjecents
            }
            System.out.println();
        }
    }
}
