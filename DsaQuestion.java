package demo;

class DSaQuestion {

// You are given an array prices where prices[i] is the price of 
// a given stock on the i-th day. You want to maximize your 
// profit by choosing a single day to buy one stock and choosing
//  a different day in the future to sell that stock.
//     Example: prices = [7,1,5,3,6,4] => 5




     public static int Buysell(){
      int[]  prices = {1,2,4,2,5,7,2,4,9,0};
      
        int buy=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;                             //[7,1,5,3,6,4]
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else if (buy<prices[i]){
                profit=prices[i]-buy;

                if(profit>maxprofit){
                    maxprofit=profit;//5
                }
                


            }
            
               

            
        }



        return maxprofit;
     }

//  Problem: You are given an array prices where prices[i] is the price of a 
 //  given stock on the i-th day. Design an algorithm to find the maximum profit. 
//  You may complete as many transactions as you like (i.e., buy one and sell one 
 //  share of the stock multiple times).
 //  Example: prices = [7,1,5,3,6,4] => 7 (buy on day 2, sell on day 3, buy on day 
 //  4, sell on day 5)
 
 public static int Buysell2(){
    int []prices = {7,1,5,3,6,4}; 
    int profit=0;
    for(int i=1;i<prices.length;i++){//
        if(prices[i]>prices[i-1]){//1
            profit+=prices[i]-prices[i-1];//4
        }
    }
    return profit;
 }










}
