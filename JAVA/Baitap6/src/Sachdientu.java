public class Sachdientu extends Book implements IDownload {
    private String dungLuong;
    private int luotTai, giaThanh;
    private int tongTien;

    public Sachdientu() {

    }

    public Sachdientu(String dungLuong, int luotTai, int giaThanh, int tongTien) {
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
        this.tongTien = tongTien;
    }

    public Sachdientu(int id, String name, String nhaXB, String namXB, String dungLuong, int luotTai, int giaThanh,
            int tongTien) {
        super(id, name, nhaXB, namXB);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
        this.tongTien = tongTien;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap dung luong: ");
        dungLuong = sc.nextLine();
        System.out.println("Nhap so luot tai: ");
        luotTai = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vao gia thanh: ");
        giaThanh = Integer.valueOf(sc.nextLine());

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "--" + dungLuong + "--" + luotTai + "--" + giaThanh;
    }

    @Override
    public int tinhTien() {
        // TODO Auto-generated method stub
        return luotTai * giaThanh;
    }
    
}
