import java.util.Scanner;

public class chuoi {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Độ dài của chuỗi là: ");
        System.out.println(chuoi.length());
    }
    
}
