public class Waiter extends Employee {
    private int compensate;
    

    public int getCompensate() {
        return compensate;
    }


    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }


    public Waiter(int compensate) {
        this.compensate = compensate;
    }


    public Waiter(int id, int age, int basicSalary, String name, int compensate) {
        super(id, age, basicSalary, name);
        this.compensate = compensate;
    }

    // @Override
    // public void input() {
    //     // TODO Auto-generated method stub
    //     super.input();
    //     System.out.println("Nhap tien tip: ");
    //     compensate = Integer.valueOf(sc.nextLine());
    // }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        return compensate + getBasicSalary();
    }


    @Override
    public String toString() {
        return super.toString()+"Waiter [compensate=" + compensate + "]"+"Luong thuc nhan: "+ calculatorSalary();
    }
    
}
