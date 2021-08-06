package Task3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
    ArrayList<Days> weekendDays = new ArrayList<>();
    ArrayList<Days> holidayDays = new ArrayList<>();

    static class Days {
        String nameOfTheDay;
        GregorianCalendar date;
        boolean isWeekendOrNot;

        public Days(String nameOfTheDay, GregorianCalendar date, boolean isWeekendOrNot) {
            this.nameOfTheDay = nameOfTheDay;
            this.date = date;
            this.isWeekendOrNot = isWeekendOrNot;
        }

        public String getNameOfTheDay() {
            return nameOfTheDay;
        }

        public GregorianCalendar getDate() {
            return date;
        }

        public boolean isWeekendOrNot() {
            return isWeekendOrNot;
        }

        public String toString() {
            GregorianCalendar day = getDate();
            String dayAsString = day.get(Calendar.YEAR) + " " + (day.get(Calendar.MONTH) + 1) + " " + day.get(Calendar.DAY_OF_MONTH);
            return "\nname of the day: '" + getNameOfTheDay() + "' in " + dayAsString;
        }
    }


    public void addNewDay(String naneOfTheDay, GregorianCalendar date, boolean isWeekendOrNot) {
        Days day = new Days(naneOfTheDay, date, isWeekendOrNot);
        if (isWeekendOrNot) {
            weekendDays.add(day);
        } else {
            holidayDays.add(day);
        }
    }

    public String getWeekendDays() {
        return weekendDays.toString();
    }

    public String getHolidayDays() {
        return holidayDays.toString();
    }

}
