package Aceenture;


// In minimun how many attempts you can convert given number into 1 ,
//        rule 1 -> divide only once from any of the factorial of the given number (Excluding num)
//        rule 2 -> subtract by one 
public class SubDivEqual {
    public static int sub_div_count(int num){
        if(num == 0){
            return 0;
        }
        int count = 0;
        int maxFact = 0;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                maxFact = i;
            }
        }
        if(maxFact > 1){
            num = num / maxFact;
            count++;
        }
        while (num > 1){
            count++;
            num--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sub_div_count(25));
    }
}
