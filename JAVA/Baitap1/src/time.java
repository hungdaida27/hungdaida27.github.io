import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        LocalDateTime hientai = LocalDateTime.now();
        System.out.println("Hiện tai la: " + hientai);
        DateTimeFormatter intheodd = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String formatDate = hientai.format(intheodd);
        System.out.println("Ngày hiện tại là: " +formatDate);
    }
    
}
