import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String nhaXB, namXB;
    Scanner sc = new Scanner(System.in);

    public Book() {
    }
    
    public Book(int id, String name, String nhaXB, String namXB) {
        this.id = id;
        this.name = name;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
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
    public String getNhaXB() {
        return nhaXB;
    }
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
    public String getNamXB() {
        return namXB;
    }
    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }

    public void input() {
        System.out.println("Nhap vao id sach: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vao ten sach: ");
        name = sc.nextLine();
        System.out.println("Nhap vao nah xuat ban: ");
        nhaXB = sc.nextLine();
        System.out.println("Nhap vao nam xuat ban: ");
        namXB = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", namXB=" + namXB + ", name=" + name + ", nhaXB=" + nhaXB + "]";
    }

    
    
}
