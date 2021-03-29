import java.util.Scanner;
import java.lang.Math;

public class GiaiPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, x;
        double delta;
        System.out.print("Nhap vao a: ");
        a = sc.nextDouble();
        while (a == 0) {
            System.out.print("Nhap lai a: ");
            a = sc.nextDouble();
        }
        System.out.print("Nhap vao b: ");
        b = sc.nextDouble();
        System.out.print("Nhap vao c: ");
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println(" Phuong trinh vo nghiem!");
        }
        else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);

        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            
        }
    }
    
}
