package array;

public class Array_1D_08_11_buyandsellStock {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

       static public int maxProfit(int[] prices) {
           int buy = prices[0];
           int profit = 0;
           for (int i = 1; i < prices.length; i++) {
               if (prices[i] < buy) {
                   buy = prices[i];
               } else if (prices[i] - buy > profit) {
                   profit = prices[i] - buy;
               }
           }
           return profit;
       }
    }

