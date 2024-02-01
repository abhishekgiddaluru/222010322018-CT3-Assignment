package Test.ClgAssgn;

import java.util.*;
public class Que7{
    public static int floor(int array[]){
        int n = array.length;
        int Max = array[0];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                Max = array[i];
                count++;
            } else if(array[i] == Max){
                count++;
            }
        }
        if(Max > n){
            return Max;
        } else{
            return n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,1,2,0,9};
        System.out.println(floor(array));
    }    
}
