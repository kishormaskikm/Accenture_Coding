package Basic_Que;

public class Fancy_pattern_1 {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i < n; i++){
            int start_num_idx = 8-i;
            int num = i + 1;
            int count = num;
            for (int j = 0; j<17; j++){
                if(j == start_num_idx && count>0){
                    System.out.print(num);
                    start_num_idx+=2;
                    count--;
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
