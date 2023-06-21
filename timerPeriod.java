import java.time.*;
import java.time.temporal.*;

public class timerPeriod { 
    public static void main(String args[]){
        int dd, mm, yyyy;
        dd = 15;
        mm = 8;
        yyyy = 2002;
        Period p = Period.of(yyyy, mm, dd);
        System.out.println(p.subtractFrom(LocalDate.now()));
    }
    
}
