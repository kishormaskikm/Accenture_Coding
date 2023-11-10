package ArrayQue;
//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
public class Sort012 {
    public static void sort012(int a[], int n)
    {
        int zero = 0, one = 0, two =0;
        for(int i =0; i<a.length; i++){
            if(a[i]==0)zero++;
            if(a[i]==1)one++;
            if(a[i]==2)two++;
        }
        for(int i = 0; i<zero; i++){
            a[i] = 0;
        }
        for(int i = zero; i<zero+one; i++){
            a[i] = 1;
        }
        for(int i =one + zero ; i<a.length; i++){
            a[i] = 2;
        }

    }
}
