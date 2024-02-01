package Test.ClgAssgn;

import java.util.*;
public class Que15{
    public static int[] common(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1[i] == arr2[j]){
                    result[i] += arr1[i];
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = sc.nextInt();
        System.out.print("Array2 size: ");
        int size2 = sc.nextInt();

        int a1[] = new int[size];
        int a2[] = new int[size2];
        System.out.println("Enter array1 elements: ");
        for(int i = 0; i < size; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter Array2 elementss: ");
        for(int i = 0; i < size2; i++){
            a2[i] = sc.nextInt();
        }

        int result[] = common(a1, a2);
        System.out.println("The common elements are: ");
        System.out.println();
        for(int i = 0; i < result.length; i++){
            if(result[i] != 0){
                System.out.print(result[i]  + " ");
            }
        }
    }    
}
