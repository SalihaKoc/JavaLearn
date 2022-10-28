package J22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println("bugun = " + bugun); // 2022-10-25
        System.out.println("bugün.getYear() = " + bugun.getYear()); // 2022
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue()); // 10
        System.out.println("bugun.getMonth() = " + bugun.getMonth()); // OCTOBER
        System.out.println("bugün.getDayOfYear() = " + bugun.getDayOfYear()); // 298
        System.out.println("bugün.getDayOfMonth() = " + bugun.getDayOfMonth()); // 25
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek()); // TUESDAY

        LocalDate date1= LocalDate.of(1923,10,29);
        LocalDate date2= LocalDate.of(1923, Month.OCTOBER,29);

        //verilen bir tarihin öncesi ve sonrasına gitme... minus() geçmiş tarihe, plus() ileri tarihe

        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date1.plusMonths(3) = " + date1.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));

    }
}
