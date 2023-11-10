package ArrayQue;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/common-elements1132/1
public class Comman_element {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 , j = 0 , k = 0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j]==C[k]){
                list.add(A[i]);
            }else if(A[i] < B[j]){
                i++;
            }else if(B[j] < C[k]){
                j++;
            }else{ // we reach were , x>y and z<y .. i.e , Z is smallest
                k++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = 6;
        int n2 = 5;
        int n3 = 8;

        System.out.println(commonElements(A,B,C,n1,n2,n3));
    }
}
