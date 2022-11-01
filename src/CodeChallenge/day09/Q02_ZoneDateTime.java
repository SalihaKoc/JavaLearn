package CodeChallenge.day09;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {

    public static void main(String[] args) {

        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Asia/Tokyo nun saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime Tokyo=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(Tokyo);

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println(Tokyo.format(format) + " Asia/Tokyo");
        System.out.println(format.format(Tokyo));
    }
}
