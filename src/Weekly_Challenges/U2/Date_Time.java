package Weekly_Challenges.U2;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class Date_Time {
    public static void main(String[] args) {


        LocalDate JTreeRelease = LocalDate.of(1987,3,9);
        LocalDate RnHumRelease = LocalDate.of(1988,10,10);
        LocalDate today = LocalDate.now();

        Period p1 = Period.between(JTreeRelease, today);
        Period p2 = Period.between(JTreeRelease, RnHumRelease);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(RnHumRelease.plusYears(1).plusMonths(11).plusDays(3));



    }
}
