package Test.ClgAssgn;

import java.util.*;
public class Que6{
    public static void sumdigit(int arr[]){
        int n = arr.length;
        int arrayy[] = new int[n+1];
        int nn = arrayy.length;
        if(arr[0] == 9){
            for(int i = 1; i < nn; i++){
                arrayy[i] = arr[i-1];
            }
            if(arrayy[nn-1] <= 8){
                arrayy[nn-1] += 1;
            } else{
                for(int i = nn - 1; i > 0; i--){
                    if(arrayy[i] >= 9){
                        arrayy[i] = 0;
                        arrayy[i-1] += 1;
                    } else{
                        break;
                    }
                }
            }
            if(arrayy[0] == 0){
                for(int i = 1; i < nn; i++){
                    arr[i-1] = arrayy[i];               //previous array 0 element is new aray 1st element.
                    System.out.print(arr[i-1] + " ");
                }
            } else{
                for(int i = 0; i < nn; i++){
                    System.out.print(arrayy[i-1] + " ");
                }
            }
            for(int i = 0; i < nn; i++){
                if(arrayy[0] == 0){
                    continue;
                } else{
                    System.out.print(arrayy[i] + " ");
                }
            }
            System.out.println();
        } else if(arr[n-1] <= 8){
            arr[n-1] += 1;
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        } else{
            for(int i = n-1; i > 0; i--){
                if(arr[i] >= 9){
                    arr[i] = 0;
                    arr[i-1] += 1;
                } else{
                    break;
                }
            }
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1,2,4};
        int array2[] = {9,9,1};
        sumdigit(array);
        sumdigit(array2);
    }
}
