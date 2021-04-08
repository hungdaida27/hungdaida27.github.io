public class LapTrinhVien extends NhanVien {
    private int overtime;
    private int salaryltv;
    public LapTrinhVien(int overtime, int salaryltv) {
        this.overtime = overtime;
        this.salaryltv = salaryltv;
    }
    
    public LapTrinhVien() {
    }

    public int getOvertime() {
        return overtime;
    }
    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
    public int getSalaryltv() {
        return salaryltv;
    }
    public void setSalaryltv(int salaryltv) {
        this.salaryltv = salaryltv;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so gio lam them: ");
        overtime = sc.nextInt();
    }
    
    public void tinhluongltv() {
        salaryltv = getSalary() + overtime * 200000;
    }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So gio lam them la: "+overtime);
        System.out.println("Luong thuc nhan: "+salaryltv);
    }


    public LapTrinhVien(int id, int age, int salary, String name, String phone, String email, int overtime,
            int salaryltv) {
        super(id, age, salary, name, phone, email);
        this.overtime = overtime;
        this.salaryltv = salaryltv;
    }
    
}
