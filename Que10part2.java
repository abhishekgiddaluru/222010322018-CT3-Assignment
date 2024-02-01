package Test.ClgAssgn;

// method-2 for solving this question

import java.util.*;
public class Que10part2{
    public static boolean Palindrome(int array[]){
        int n = array.length;
        boolean check = false;
        for(int i= 0; i < n/2; i++){
            if(array[i] == array[n-i-1]){
                check = true;
                continue;
            } else{
                check = false;
                break;
            }
        }
        if(check == true){
            return true;
        }
        return false;
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1,2,5,2,1};
        System.out.println(Palindrome(array));
    }
}