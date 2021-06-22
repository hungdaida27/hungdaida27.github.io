import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Nhap bang cu chuong muon in ra: ");
        // n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.printf("%d x %d = %d %n", n,i,n*i);
        // }
        for (int i = 2; i < 10; i++) {
            System.out.println("Bang cuu chuong " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d %n", i, j, i * j);
            }
    System.out.println();
}
    }
}
