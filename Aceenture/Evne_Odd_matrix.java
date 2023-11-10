package Aceenture;

//Problem Statement

//You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd)
//        in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on.
//        then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices.


import java.util.*;
import java.util.Arrays;

public class Evne_Odd_matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for(int i =0 ; i<arrSize; i++){
            System.out.println("Enter the vaalue at index "+i);
            arr[i] = sc.nextInt();
        }


        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i<arrSize; i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(odd);
        Collections.sort(even);

        int ans = even.get(even.size()-2) + odd.get(odd.size() - 2);
        System.out.println("The sum of second largest element in both array is : "+ans);


    }
}
