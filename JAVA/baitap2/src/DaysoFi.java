import java.util.Scanner;

public class DaysoFi {
    public static void main(String[] args) {
        // int n;     Dung for
        // int fi;
        // int f1 = 1;
        // int f2 = 1;
        // int dem;

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Nhap vao so nguyen duong n: ");
        // n = sc.nextInt();
        // System.out.println("Dãy số Fibonaci với "+n+" số là: ");
        // for (dem = 1; dem <= n; dem++) {
        //     System.out.println(f1);
        //     fi = f1 + f2;
        //     f1 = f2;
        //     f2 = fi;

        // }
   Scanner sc = new Scanner(System.in);
        int n, i, f1, f2, fi;
        i = 1;
        f1 = 1;
        f2 = 1;
        System.out.print("Nhập vào số tự nhiên n: ");
        n = sc.nextInt();
        System.out.println("Dãy số Fibonaci với "+n+" là: ");
        while (i <= n) {
            System.out.println(f1);
            fi = f1 + f2;
            f1 = f2;
            f2 = fi;
            i++;
        }
    }
}
