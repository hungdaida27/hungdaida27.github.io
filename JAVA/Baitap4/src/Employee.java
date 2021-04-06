import java.util.Scanner;

public class Employee {
    private int id;
    private String name, dateOfBirth, address, position;
    private double basicSalary;
    private double tangca;
    private double salary;
    Scanner sc = new Scanner(System.in);

    public Employee() {
        
    }

    public Employee(int id, String name, String dateOfBirth, String address, String position, double basicSalary,
            Scanner sc) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
        this.basicSalary = basicSalary;
    }
    

    public void input() {
        System.out.println("Nhap vao id nhan vien: ");
        id = sc.nextInt();
        System.out.println("Nhap vao ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("Nhap vao ngay sinh(dd-MM-yy): ");
        dateOfBirth = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        basicSalary = sc.nextDouble();
        System.out.println("Nhap vao so gio tang ca: ");
        tangca = sc.nextDouble();
    }

    public void display() {
        System.out.println(id+"--"+name+"--"+dateOfBirth+"--"+address+"--"+position+"--"+basicSalary+"--"+salary);
         
    }


    public int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Employee(double tangca, double salary) {
        this.tangca = tangca;
        this.salary = salary;
    }

    public double getTangca() {
        return tangca;
    }

    public void setTangca(double tangca) {
        this.tangca = tangca;
    }

    public void salaryCalculator() {
        salary = basicSalary + 100000 * tangca;

    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    

    
    
}
