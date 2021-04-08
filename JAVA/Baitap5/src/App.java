import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int q;
        System.out.println("Lua chon danh muc: ");
        System.out.println("1. Lap Trinh Vien");
        System.out.println("2. Kiem Chung Vien");
        q = sc.nextInt();
        while (q != 1 && q != 2) {
            System.out.println("Lua chon lai nhan vien: ");
            q = sc.nextInt();
        }
        switch(q) {
            case 1:
            int n;
            System.out.print("Nhap vao so luong Lap Trinh Vien: ");
            n = sc.nextInt();
            LapTrinhVien laptrinhvien[] = new LapTrinhVien[n];
            for (int i = 0; i < laptrinhvien.length; i++) {
                System.out.println("Nhap vao nhan vien thu " + (i + 1));
                laptrinhvien[i] = new LapTrinhVien();
                laptrinhvien[i].input();
                laptrinhvien[i].tinhluongltv();
            }
            System.out.println();

            System.out.println("Thong tin vua nhap la: ");
            for (int i = 0; i < laptrinhvien.length; i++) {
                laptrinhvien[i].display();
            }
            break;
        case 2:
        
            int k;
            System.out.print("Nhap vao so luong Kiem Chung Vien: ");
            k = sc.nextInt();
            KiemChungVien kiemchungvien[] = new KiemChungVien[k];
            for (int i = 0; i < kiemchungvien.length; i++) {
                System.out.println("Nhap vao nhan vien thu " + (i + 1));
                kiemchungvien[i] = new KiemChungVien();
                kiemchungvien[i].input();
                kiemchungvien[i].tinhluongkcv();
            }
            System.out.println();

            System.out.println("Thong tin vua nhap la: ");
            for (int i = 0; i < kiemchungvien.length; i++) {
                kiemchungvien[i].display();
            }
            break;
        }
       

        
    }
}
