import java.util.Scanner;

public abstract class Employee {
    private int id, age, basicSalary;
    private String name;
    Scanner sc = new Scanner(System.in);
    public Employee() {
    }
    public Employee(int id, int age, int basicSalary, String name) {
        this.id = id;
        this.age = age;
        this.basicSalary = basicSalary;
        this.name = name;
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
    public int getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void input() {
    //     System.out.println("Nhap id nhan vien: ");
    //     id = Integer.valueOf(sc.nextLine());
    //     System.out.println("Nhap ten nhan vien: ");
    //     name = sc.nextLine();
    //     System.out.println("Nhap tuoi: ");
    //     age = Integer.valueOf(sc.nextLine());
    //     System.out.println("Nhap luong co ban: ");
    //     basicSalary = Integer.valueOf(sc.nextLine());
    // }

    public abstract int calculatorSalary();


    @Override
    public String toString() {
        return "Employee [age=" + age + ", basicSalary=" + basicSalary + ", id=" + id + ", name=" + name + "]";
    }
    
    
    

    
}
