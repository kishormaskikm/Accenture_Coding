package Basic_Que;

public class Fancy_pattern_2 {
    public static void main(String[] args) {
        //floud's Tringle pattern
        int n =7;
        int count = 1;
        for (int i =0; i<n; i++){
            for (int j = 0; j<=i ; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
