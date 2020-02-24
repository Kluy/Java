package task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(1986, 8,19, 20, 15, 16);
        Calendar calendar2 = new GregorianCalendar();

        calendar2.add(Calendar.YEAR, -(calendar.get(Calendar.YEAR)));
        calendar2.add(Calendar.MONTH, -(calendar.get(Calendar.MONTH)));
        calendar2.add(Calendar.DAY_OF_MONTH, -(calendar.get(Calendar.DAY_OF_MONTH)));
        calendar2.add(Calendar.HOUR, -(calendar.get(Calendar.HOUR)));
        calendar2.add(Calendar.MINUTE, -(calendar.get(Calendar.MINUTE)));
        calendar2.add(Calendar.SECOND, -(calendar.get(Calendar.SECOND)));

        System.out.println(calendar2.get(Calendar.YEAR) + " года, "
                + calendar2.get(Calendar.MONTH) + " месяц, "
                + calendar2.get(Calendar.DAY_OF_MONTH) + " день, "
                + calendar2.get(Calendar.HOUR) + " часов, "
                + calendar2.get(Calendar.MINUTE) + " минут, "
                + calendar2.get(Calendar.SECOND) + " секунд");
    }
}