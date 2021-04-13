public class Sachgiaokhoa extends Book implements IMuon, IKho {
    private int soTrang;
    private String tinhTrang;
    private int soLuong, soMuon;
    private String viTri;
    private int tonKho;

    public Sachgiaokhoa(int soTrang, String tinhTrang, int soLuong, int soMuon, String viTri, int tonKho) {
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuong = soLuong;
        this.soMuon = soMuon;
        this.viTri = viTri;
        this.tonKho = tonKho;
    }
    public Sachgiaokhoa(int id, String name, String nhaXB, String namXB, int soTrang, String tinhTrang, int soLuong,
            int soMuon, String viTri, int tonKho) {
        super(id, name, nhaXB, namXB);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuong = soLuong;
        this.soMuon = soMuon;
         this.viTri = viTri;
        this.tonKho = tonKho;
    }
    
    public Sachgiaokhoa() {

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
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getSoMuon() {
        return soMuon;
    }

    public void setSoMuon(int soMuon) {
        this.soMuon = soMuon;
    }
    
    
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so trang sach: ");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap tong so luong: ");
        soLuong = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap so luong dang muon:");
        soMuon = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vi tri sach: ");
        viTri = sc.nextLine();

    }
    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public int getTonKho() {
        return tonKho;
    }

    public void setTonKho(int tonKho) {
        this.tonKho = tonKho;
    }
    
  
    }
    @Override
    public String toString() {
        super.toString();
        return "Sachgiaokhoa [soLuong=" + soLuong + ", soMuon=" + soMuon + ", soTrang=" + soTrang + ", tinhTrang="
                + tinhTrang + ", tonKho=" + tonKho + ", viTri=" + viTri + "]";
    }

    @Override
    public String timViTri(String viTri) {
        // TODO Auto-generated method stub
        return viTri;
    }

    @Override
    public int tinTonKho() {
        // TODO Auto-generated method stub
        return soLuong - soMuon;
    }

    
    
}
