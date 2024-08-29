public class systemDate {
    public static void main(String[] args) {  
        
        java.util.Date dt=new java.util.Date();
        System.out.println(dt);
    

        long timeMs=dt.getTime();
        java.sql.Date dt1=new java.sql.Date(timeMs);
        System.out.println(dt1);

}
}
