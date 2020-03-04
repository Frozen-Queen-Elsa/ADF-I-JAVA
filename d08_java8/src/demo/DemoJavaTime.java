package demo;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

public class DemoJavaTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n  === DEMO DATE-TIME API === ");
            System.out.println("1. Clock");
            System.out.println("2. Duration");
            System.out.println("3. Instant");
            System.out.println("4. LocalDate");
            System.out.println("5. LocalDateTime");
            System.out.println("6. LocalTime");
            System.out.println("7. MonthDay");
            System.out.println("8. OffsetDateTime");
            System.out.println("10. thoat");
            System.out.print(" >> nhap chuc nang [1-10]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    clock();
                    break;
                case "2":
                    duration();
                    break;
                case "3":
                    instant();
                    break;
                case "4":
                    localDate();
                    break;
                case "5":
                    localDateTime();
                    break;
                case "6":
                    localTime();
                    break;
                case "7":
                    monthDay();
                    break;
                case "8":
                    offsetDateTime();
                    break;
                case "9":
                    break;
                case "10":
                    return;
            }
        }
    }

    static void clock() {
        System.out.println("\n *** Demo CLOCK ***");

        // create default clock
        Clock c1 = Clock.systemUTC();
        System.out.println("Clock : " + c1);

        // Creates a clock instance based on system clock zone  
        Clock c2 = Clock.systemDefaultZone();
        System.out.println("Clock : " + c2);

        //System.out.println(TimeZone.getDefault());
        //System.out.println(System.currentTimeMillis());
    }

    static void duration() {
        System.out.println("\n *** Demo DURATION ***");

        Instant t1 = Instant.parse("2019-11-26T00:00:00.00Z");
        Instant t2 = Instant.now();

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        System.out.println("Duration of days between t1 and t2: " + Duration.between(t1, t2).toDays());

        System.out.println(Duration.ofMinutes(120));
    }

    static void instant() {
        System.out.println("\n *** Demo INSTANT ***");
        Instant t0 = Instant.EPOCH;
        Instant t1 = Instant.now();
        Instant t2 = t1.minus(Duration.ofDays(100));

        Instant t3 = Instant.now(Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(7)));

        Instant t4 = Instant.parse("2020-04-30T08:50:59.00Z");
        System.out.println("EPOCH: " + t0);
        System.out.println("Now [UTC]: " + t1);
        System.out.println("100 days before: " + t2);
        System.out.println("Now [TimeZone]: " + t3);
        System.out.println("t3: " + t4);
    }

    static void localDate() {
        System.out.println("\n *** Demo LOCALDATE ***");
        LocalDate d1 = LocalDate.of(2019, 11, 26);
        LocalDate d2 = d1.plusDays(100);
        LocalDate d3 = LocalDate.now();
        LocalDate d4 = d3.minusYears(4);

        System.out.println("d1 : " + d1);
        System.out.println("d2 : " + d2);
        System.out.println("d3 : " + d3);
        System.out.println("d4 : " + d4);
        System.out.println("d1-Month : " + d1.getMonth());
        System.out.println("d1-Day : " + d1.getDayOfWeek());
    }

    static void localDateTime() {
        System.out.println("\n *** Demo LOCALDATETIME ***");
        LocalDateTime d1 = LocalDateTime.of(2019, 11, 26, 2, 20, 30);
        LocalDateTime d2 = d1.plusDays(100);
        LocalDateTime d3 = LocalDateTime.now(ZoneId.of("Asia/Saigon"));
        LocalDateTime d4 = LocalDateTime.now(ZoneId.of("Europe/Paris"));

        System.out.println("d1 : " + d1);
        System.out.println("d2 : " + d2);
        System.out.println("d3-Saigon : " + d3);
        System.out.println("d4-Paris : " + d4 + "\n");

        System.out.println("d1-Month : " + d1.getMonth());
        System.out.println("d1-Day : " + d1.getDayOfWeek());
        System.out.println("d1 : " + d1.format(DateTimeFormatter.ISO_DATE));
        System.out.println("d1 : " + d1.format(DateTimeFormatter.ofPattern("EEE dd-MMM-yyyy hh:mm:ss")));
    }

    static void localTime() {
        System.out.println("\n *** Demo LOCALTIME ***");
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.now(Clock.systemUTC());
        LocalTime t3 = LocalTime.now(ZoneId.of("Europe/London"));

        System.out.println("t1 - local time : " + t1);
        System.out.println("t2 - UTC time: " + t2);
        System.out.println("t3 - London time: " + t3);

    }

    static void monthDay() {
        System.out.println("\n *** Demo MONTHDAY ***");

        LocalDate dob = LocalDate.of(2000, 04, 30);

        MonthDay md1 = MonthDay.now();
        MonthDay md2 = MonthDay.from(dob);

        if (md1.equals(md2)) {
            System.out.println(" *** Colorful, Joyful Birthday Buddy ***");
        } else {
            System.out.println("Nope ! Today is not yr b'day !");
        }

    }

    static void offsetDateTime() {

        LocalDateTime d = LocalDateTime.of(2020, Month.AUGUST, 22, 10, 6);

        ZoneOffset zOffset = ZoneOffset.of("+02:00");
        OffsetDateTime o1 = OffsetDateTime.of(d, zOffset);
        System.out.println("o1 : " + o1);

        OffsetDateTime o2 = OffsetDateTime.now();
        System.out.println("o2 : " + o2);
    }
}
