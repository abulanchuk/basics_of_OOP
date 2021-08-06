package Task3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calender day = new Calender();

        GregorianCalendar newYear = new GregorianCalendar(2021, Calendar.DECEMBER , 31);
        GregorianCalendar mansDay = new GregorianCalendar(2021, Calendar.FEBRUARY , 23);


        day.addNewDay("31 of december",newYear, false);
        day.addNewDay("Man's day",mansDay, false);

        System.out.println("1. output list of weekendDays, 2. output list of holidayDays");
        int n = in.nextInt();
        switch (n) {
            case 1: {
                String res1 = day.getWeekendDays();
                System.out.println(res1);
            }
            case 2: {
               String res2 = day.getHolidayDays();
                System.out.println(res2);
            }
        }
    }
}
