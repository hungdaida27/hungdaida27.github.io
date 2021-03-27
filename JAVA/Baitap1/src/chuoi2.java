import java.util.Scanner;

public class chuoi2 {
    public static void main(String[] args) {
        String chuoi1;
        String chuoi2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        chuoi1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        chuoi2 = scanner.nextLine();
        System.out.println("Hai chuoi tren co giong nhau khong(Khong phan biet hoa thuong): ");
        System.out.println(chuoi1.equals(chuoi2));
        System.out.println("Hai chuoi tren co giong nhau khong(Phan biet hoa thuong): ");
        System.out.println(chuoi1.equalsIgnoreCase(chuoi2));

     }
}
