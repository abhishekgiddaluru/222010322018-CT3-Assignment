package Test.ClgAssgn;

// Que-3

import java.util.*;
public class Que3{
    public static int climbStairs(int A) {
        if (A == 1) {
            return 1;
        } else if (A == 2) {
            return 2;
        }
        
        // Initialize an array to store the number of ways to reach each step
        int[] ways = new int[A + 1];
        ways[1] = 1;
        ways[2] = 2;
        
        // Iterate from step 3 to A, calculating the number of ways at each step
        for (int i = 3; i <= A; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        
        return ways[A];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2)); 
        System.out.println(climbStairs(3)); 
    }
}
