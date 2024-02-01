package Test.ClgAssgn;

import java.util.*;
public class Que1{
    public static int tofy(int arrayy[]){
        int tofy[] = new int[arrayy.length];
        int n = arrayy.length;
        int total = 0;

        for(int i = 0; i <= n-1; i++){
            tofy[i] = 1;
        }
        if(n==1){
            return 1;
        }
        for(int i = 0; i <= n-1; i++){
            tofy[i] = 1;
        }
        for(int i = 0; i < n-1; i++){
            if(arrayy[i+1] > arrayy[i]){
                tofy[i+1] =  tofy[i] + 1;
            } 
        }
        for(int i = n-2; i >= 0; i--){
            if((arrayy[i] > arrayy[i+1] ) && tofy[i] <= tofy[i+1]){
                tofy [i] = tofy[i+1] + 1;
            }
            total += tofy[i];
        }
        total += tofy[n-1];
        return total;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student count in array: ");
        int length = sc.nextInt();

        System.out.println("Enter ratings: ");
        int rating[] = new int[length];
        for(int i = 0; i < length; i++){
            rating[i] = sc.nextInt();
        }
        int result = tofy(rating);
        
        System.out.println();
        System.out.print("The total number of candies to be distributed are: " + result);

    }    
}
