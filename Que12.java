package Test.ClgAssgn;

import java.util.*;
public class Que12{
    public static int Reverse(int value){
        int reversedValue = 0;
        while(value != 0){
            int digit = value % 10;
            reversedValue = (reversedValue * 10) + digit;
            value /= 10;
        }
        return reversedValue;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        int result = Reverse(value);
        System.out.println("The reverse of the given value is: " + result);
    }    
}
