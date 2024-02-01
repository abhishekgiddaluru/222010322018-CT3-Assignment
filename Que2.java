package Test.ClgAssgn;

import java.util.*;
public class Que2{
    public static void stockPrice(int prices[]){
        int BuyPrice = prices[0];
        int n = prices.length;
        int MaxProfit = Integer.MIN_VALUE;
        
        for(int i = 0; i < n-1; i++){               //(consider, array ka coount) arr[0,1,2,.....]
            int profit = 0;
            int SellPrice = prices[i+1];
            if(BuyPrice < SellPrice){
                profit += SellPrice - BuyPrice;
            } else if(BuyPrice > SellPrice){
                BuyPrice = SellPrice;
            }
            MaxProfit = Math.max(MaxProfit, profit);
        }
        System.out.println("The Maximum Profit gained is: " + MaxProfit);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int prices[] = {7,2,5,3,4,6};
        stockPrice(prices);
    }
}
