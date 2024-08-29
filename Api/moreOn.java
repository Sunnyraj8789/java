import java.time.LocalDate;
import java.time.LocalTime;

public class moreOn {

    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);

        int day=ld.getDayOfMonth();
        int month=ld.getDayOfMonth();
        int year=ld.getYear();

        System.out.println(day +"/" +month + "/" +year);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        int hour=time.getHour();
        System.out.println(hour);



    }
    
}
