

public class Kitchen extends Employee {
    private int serviceCharge;

    

    public int getServiceCharge() {
        return serviceCharge;
    }



    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }



    public Kitchen(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }



    public Kitchen(int id, int age, int basicSalary, String name, int serviceCharge) {
        super(id, age, basicSalary, name);
        this.serviceCharge = serviceCharge;
    }

// @Override
// public void input() {
//     // TODO Auto-generated method stub
//     super.input();
//     System.out.println("Nhap tien dich vu: ");
//     serviceCharge = Integer.valueOf(sc.nextLine());
// }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        return serviceCharge + getBasicSalary();
    }



    @Override
    public String toString() {
        return super.toString()+"Kitchen [serviceCharge=" + serviceCharge + "]" +"Luong thuc nhan: "+ calculatorSalary();
    }
    
}
