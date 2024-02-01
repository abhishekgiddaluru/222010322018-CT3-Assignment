package Test.ClgAssgn;

// method - 1 to solve this question

import java.util.*;
public class Que10{
    public static int Palindrome(int number){
        int reversedValue = 0;
        while(number != 0){
            int digit = number % 10;
            reversedValue = (reversedValue * 10) + digit;
            number /= 10;
        }
        return reversedValue;
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int result = Palindrome(N);
        if(result == N){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}



