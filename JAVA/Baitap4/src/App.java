import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong nhan vien: ");
        n = sc.nextInt();

        Employee employee[] = new Employee[n];
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + i + 1);
            employee[i] = new Employee();
            employee[i].input();
            employee[i].salaryCalculator();
        }
        
        System.out.println("thong tin vua nhap: ");
        for (int i = 0; i < n; i++) {
            employee[i].display();
        }

    }
}
