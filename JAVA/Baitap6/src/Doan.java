public class Doan extends Book implements IKho {
    private int soTrang;
    private String tinhTrang, namBV;
    private String viTri;

    public Doan() {
        
    }

    public Doan(int soTrang, String tinhTrang, String namBV, String viTri) {
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBV = namBV;
        this.viTri = viTri;
    }

    public Doan(int id, String name, String nhaXB, String namXB, int soTrang, String tinhTrang, String namBV, String viTri) {
        super(id, name, nhaXB, namXB);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBV = namBV;
        this.viTri = viTri;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNamBV() {
        return namBV;
    }

    public void setNamBV(String namBV) {
        this.namBV = namBV;
    }

    


    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so luong do an: ");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nam bao ve: ");
        namBV = sc.nextLine();
        System.out.println("Nhap vao vi tri do an: ");
        viTri = sc.nextLine();
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        super.toString();
        return "Doan [namBV=" + namBV + ", soTrang=" + soTrang + ", tinhTrang=" + tinhTrang + ", viTri=" + viTri + "]";
    }

    @Override
    public String timViTri(String viTri) {
        // TODO Auto-generated method stub
        return viTri;
    }


}
