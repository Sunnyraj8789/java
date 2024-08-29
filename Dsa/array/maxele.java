public class maxele {
   public static void main(String[] args) {
    int arr[]={24,21,54,65,43};
    int max=Integer.MIN_VALUE;// to store the starting index 
    for(int val: arr){
        max=Math.max(max, val); //starting index compare to the other element
    }
     System.out.println(max);
   }
    
}
