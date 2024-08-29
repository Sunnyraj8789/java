import java.util.Arrays;
import java.lang.*;
import java.util.Comparator;


public class fractionalKnapsack {
    private static double getMaxValue(ItemValue[] arr,int capacity){
        //1. sorting items by profit/weight ratio:
        Arrays.sort(arr,new Comparator<ItemValue>(){
            public int compare(ItemValue item1,ItemValue item2){
                double cpr1=Double.valueOf(item1.profit/item1.weight);
                double cpr2=Double.valueOf(item2.profit/item2.weight);
                if(cpr1<cpr2)
                return 1;
                else
                return -1;
            }
        }); 
                                                 

        double totalvalue =0;
        for(ItemValue i:arr){
            int currWt=(int)i.weight;
            int curProfit=(int)i.profit;
            if(capacity-currWt>=0){
                //this weight can be picked whole
                capacity=capacity-currWt;
                totalvalue+=curProfit;
            }
            else{
                //item cant be picked whole
                double fraction=
                ((double)capacity/(double)currWt);
                totalvalue+=(currWt*fraction);
                capacity=(int)(capacity-(currWt*fraction));
                break;
            }
        }
        return totalvalue;
    }

    
    //item value class
    static class ItemValue{
        int profit,weight;
        //item value function
        public ItemValue(int profit,int wt){
            this.weight=wt;
            this.profit=profit;
        }
    }
                                   

    public static void main(String[] args) {
        ItemValue[] arr={new ItemValue(25,5),
                     new ItemValue(75,10),
                     new ItemValue(100,12),
                     new ItemValue(50,4),
                     new ItemValue(45,7),
                     new ItemValue(90,9),
                     new ItemValue(30,3),
                     };
                     int capacity=37;
                     double maxvalue=getMaxValue(arr,capacity);
                     System.out.println("maximun profit is :"+maxvalue);
    }
    
}
