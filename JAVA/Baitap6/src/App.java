import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Sachgiaokhoa> sachgiaokhoas = new ArrayList<Sachgiaokhoa>();
        ArrayList<Sachdientu> sachdientus = new ArrayList<Sachdientu>();
        ArrayList<Doan> doans = new ArrayList<Doan>();

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Tong hop: ");
        System.out.print("1. Nhap vao Sach Giao Khao: ");
        System.out.print("2. Nhap vao Sach Dien Tu: ");
        System.out.print("3. Nhap vao Do An: ");
        System.out.print("4. Xem thong tin Sach Giao Khoa: ");
        System.out.print("5. Xem thong tin Sach Dien Tu: ");
        System.out.print("6. Xem thong tin Do An: ");
        System.out.println("Lua chon cua ban: ");
        n = sc.nextInt();
        while (n == 1 && n == 2 && n == 3 && n == 4 && n == 5 && n == 6) {
            switch (n) {
            case 1:
                Sachgiaokhoa sgk = new Sachgiaokhoa();
                sgk.input();
                sachgiaokhoas.add(sgk);
                break;
            case 2:
                Sachdientu sdt = new Sachdientu();
                sdt.input();
                sachdientus.add(sdt);
                break;
            case 3:
                Doan doan = new Doan();
                doan.input();
                doans.add(doan);
                break;
            case 4:
            System.out.println("Thong tin Sach Giao Khoa: ");
            for (int i = 0; i < sachgiaokhoas.size(); i++) {
                System.out.println(sachgiaokhoas.get(i).toString());
            }
            break;
        case 5:
            System.out.println("Thong tin Sach Dien Tu: ");
            for (int i = 0; i < sachdientus.size(); i++) {
                System.out.println(sachdientus.get(i).toString());
            }
            break;
        case 6:
            System.out.println("Thong tin Do An");
            for (int i = 0; i < doans.size(); i++) {
                System.out.println(doans.get(i).toString());
            }
            }
        }

    }
}
