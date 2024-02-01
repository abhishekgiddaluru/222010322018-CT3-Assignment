package Test.ClgAssgn;

import java.util.*;
public class Que11{
    public static boolean Prime(int N){
        boolean Prime = true;
        if(N == 2){
            return true;
        } 
        for(int i = 2; i <= Math.sqrt(N); i++){
            if(N % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int N = sc.nextInt();
        Prime(N);
        System.out.println("The given number: " + N + " is: " + Prime(N));
    }
}
