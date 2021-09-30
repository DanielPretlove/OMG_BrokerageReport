import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Calendar min = new GregorianCalendar(2020, 9, 12);
        Calendar max = new GregorianCalendar(2020, 9, 15);
        int result = min.compareTo(max);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd LLL Y");
        Report data;
        if(result <= 0) {
            data = new Report(1, dateFormat.format(min.getTime()), dateFormat.format(max.getTime()), "Admin", "ABC", 5712);
            System.out.println(data);
            min.set(2020, 10, 16);
            max.set(2020,10, 16);
            data = new Report(1, dateFormat.format(min.getTime()), dateFormat.format(max.getTime()), "Admin", "CBA", 653);
            System.out.println(data);

        }

        else {
            data = new Report(1, dateFormat.format(max.getTime()), dateFormat.format(min.getTime()), "Not Admin", "ABC", 5712);
            min.set(2020, 10, 16);
            max.set(2020,10, 16);
            data = new Report(1, dateFormat.format(min.getTime()), dateFormat.format(max.getTime()), "Not Admin", "CBA", 653);
            System.out.println(data);
        }
    }


}
