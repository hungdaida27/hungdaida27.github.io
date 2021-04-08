public class KiemChungVien extends NhanVien {
    private int numbug;
    private int salarykcv;
    public KiemChungVien(int numbug, int salarykcv) {
        this.numbug = numbug;
        this.salarykcv = salarykcv;
    }
    public KiemChungVien(int id, int age, int salary, String name, String phone, String email, int numbug,
            int salarykcv) {
        super(id, age, salary, name, phone, email);
        this.numbug = numbug;
        this.salarykcv = salarykcv;
    }
    public KiemChungVien() {
    }
    public int getNumbug() {
        return numbug;
    }
    public void setNumbug(int numbug) {
        this.numbug = numbug;
    }
    public int getSalarykcv() {
        return salarykcv;
    }

    public void setSalarykcv(int salarykcv) {
        this.salarykcv = salarykcv;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so loi tim ra: ");
        numbug = sc.nextInt();
    }

    public void tinhluongkcv() {
        salarykcv = getSalary() + numbug * 50000;
    }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So loi tim ra la: "+numbug);
        System.out.println("Luong thuc nhan: "+salarykcv);

    }
    
}
