import java.util.Scanner;

public class NhanVien {
    private int id, age, salary;
    private String name, phone, email;
    Scanner sc = new Scanner(System.in);
    public NhanVien() {
    }
    public NhanVien(int id, int age, int salary, String name, String phone, String email) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void input() {
        System.out.println("Nhap id nhan vien: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap So Dien Thoai: ");
        phone = sc.nextLine();
        System.out.println("Nhap Email: ");
        email = sc.nextLine();
        System.out.println("Nhap vao luong co ban: ");
        salary = sc.nextInt();
    }

    public void display() {
        System.out.println(id+"  "+name+"  "+age+"  "+phone+"  "+email+"  "+salary);
    }
    
}
