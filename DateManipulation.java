import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulation {
    public static void main(String[] args) {
        String inputDate = "31-12-2025";
        int N = 3000;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate newDate = date.plusDays(N);
        System.out.println(newDate.format(formatter));
    }
}
