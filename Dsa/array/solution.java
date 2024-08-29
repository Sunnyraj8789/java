public class solution{
    public static void main(String[] args) {
        
        int arr[] ={34,21,54,65,43,22,77,20};
        //max1 indicates first largest element
        //max2 indicates second largest element
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
    
    
        for(int num:arr){
            max1=Math.max(max1,num);
        }
    
        for(int num:arr){
            if(num!=max1){
                max2=Math.max(max2,num);
            }
        }
    
        if(max2==Integer.MIN_VALUE){
            System.out.println("no second largest element ");
        }
    
        else{
            System.out.println("the second largest element in a given array is "+max2);
        }
    }
    }