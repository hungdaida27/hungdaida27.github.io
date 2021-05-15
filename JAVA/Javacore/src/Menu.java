public class Menu {
    public static void chooseEmployee() {
        System.out.println("1. Nhân viên quản trị");
        System.out.println("2. Khách hàng");
    }

    public static void chooseAdmin() {
        System.out.println("1. Hiển thị tất cả sảm phẩm");
        System.out.println("2. Hiển thị thông tin dựa trên danh mục");
        System.out.println("3. Hiển thị thông tin dựa theo hãng");
        System.out.println("4. Hiển thị thông tin theo mức giá");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Thêm sản phẩm");
        System.out.println("7. Sửa thông tin sản phẩm");
        System.out.println("8. Xóa sản phẩm");
        System.out.println("9. Thoát chương trình");
    }

    public static void chooseGuest() {
        System.out.println("1. Hiển thị tất cả sảm phẩm");
        System.out.println("2. Hiển thị thông tin dựa trên danh mục");
        System.out.println("3. Hiển thị thông tin dựa theo hãng");
        System.out.println("4. Hiển thị thông tin theo danh mục và mức giá");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Thoát chương trình");
    }

    public static void chooseCatrgory() {
        System.out.println("1. CPU");
        System.out.println("2. MAIN");
        System.out.println("3. RAM");
        System.out.println("4. VGA");
        System.out.println("5. PSU");
        System.out.println("6. SSD");
    }

    public static void choosePrice() {
        System.out.println("1. Dưới 3.000.000đ ");
        System.out.println("2. Từ 3.000.000 đến 6.000.000đ ");
        System.out.println("3. Từ 6.000.000 đến 9.000.000đ ");
        System.out.println("4. Từ 9.000.000 đến 15.000.000đ ");
        System.out.println("5. Trên 15.000.000đ ");
    }

}
