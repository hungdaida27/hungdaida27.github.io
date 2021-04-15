import java.util.Scanner;
import java.lang.Math;

public class Baitap1 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        
        

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            a[i] = sc.nextInt();
        }

        System.out.println("mang vua nhap la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ "  ");
        }

        int max = a[0];
        int min = a[0];
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Phan tu nho nhat la: " + min);
        System.out.println("");

        
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<a.length;i++) {
            if (isCheck(a[i])){
                System.out.print(a[i] + " ");
                sum += a[i];
            }
        }
        System.out.println("");
        System.out.println("Tongg cac so nguyen to la: " + sum);
        
        System.out.println();
        int k;
        System.out.println("Nhap vi tri k can sua(k<n): ");
        k = sc.nextInt();
        System.out.println("Nhap gia tri muon sua doi: ");
        a[k] = sc.nextInt();
        System.out.println("Mang sau khi sua la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+ "  ");
        }

    }



    public static boolean isCheck(int n) {
        if(n<2){
        return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true; 
        }
}
