package Basic_Math;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,6,4};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

}
