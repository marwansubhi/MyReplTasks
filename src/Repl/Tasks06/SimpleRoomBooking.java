package Repl.Tasks06;

import java.time.LocalDate;

public class SimpleRoomBooking {
    public static void main(String[] args) {
        System.out.println(simpleRoomBook(false, 2, 1, 2018));

    }
//        public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
//        LocalDate date = LocalDate.of(year, month, day);
//        LocalDate date1 = LocalDate.of(2018, 7, 1);
//        LocalDate date2 = LocalDate.of(2018, 7, 8);
//        if ((isAvailable) && (date.getYear() == 2018) && (date.isBefore(date1) || date.isAfter(date2))) return true;
//        else return false;
//
//
//    }
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        if ((isAvailable && year == 2018)&&(month > 0 && month < 13)) {
                if (month==7&&day>0&&day<8)isAvailable = false;
                else return isAvailable ;
        }
        else if (month == 7 && (day > 8 && day < 32)) isAvailable = true;
         else isAvailable = false;

        return isAvailable;
    }
}