
/**
 * TimeZoneConversion
 */
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeZoneConversion {

    public static void main(String[] args) {
        // read time from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in 24 hour format: ");
        String time = sc.nextLine();
        // store the time in IST format
        String[] timeArray = time.split(":");
        int hour = Integer.parseInt(timeArray[0]);
        int minute = Integer.parseInt(timeArray[1]);
        int second = Integer.parseInt(timeArray[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        // convert the time to UTC
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        // convert the time to IST
        System.out.println("Time in IST format: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));
        cal.setTimeZone(TimeZone.getTimeZone("IST"));
        // print the time in IST format
        System.out.println("Time in IST format: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));

    }
}