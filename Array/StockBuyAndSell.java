public class StockBuyAndSell {
    
static int maxProfit(int []prices){
    
    int maxProfit1=0;
    int buyValue=Integer.MAX_VALUE;
    for(int i=0 ;i<prices.length;i++){

        if(buyValue<prices[i]){
            
           int profit=prices[i]-buyValue;
            maxProfit1=Math.max(profit, maxProfit1);

        }
        if(buyValue>prices[i]){
            buyValue=prices[i] ;
        }

    }



return maxProfit1;
}

    public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println("The maximum profit Earn is : "+maxProfit(prices)+" unit.");
    }
}
