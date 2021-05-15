import java.util.Scanner;

public class Main {
    static ProductList productList1;

    public static void main(String[] args) throws Exception {
        System.out.println("Xin chào!");
        productList1 = new ProductList();
        productList1.addProduct();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Bạn muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.println("Lựa chọn của bạn!");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                Menu.chooseEmployee();
                System.out.print("Lựa chọn của bạn: ");
                try {
                    int i = sc.nextInt();
                    sc.nextLine();
                    switch (i) {
                        case 1:
                            System.out.print("Nhập tên quản trị của bạn hoặc q để thoát: ");
                            String admin;
                            admin = sc.nextLine();
                            if (admin.equalsIgnoreCase("hung")) {
                            try {
                                while (true) {
                                    System.out.println("Xin mời lựa chọn: ");
                                    Menu.chooseAdmin();
                                    System.out.println("Lựa chọn của bạn: ");

                                        int c = sc.nextInt();
                                    switch (c) {
                                        case 1:
                                            System.out.println("Tất cả sản phẩm là: ");
                                            productList1.getAllProduct();
                                            break;
                                        case 2:
                                            System.out.println("Lựa chọn danh mục bạn muốn in ra: ");
                                            Menu.chooseCatrgory();
                                            int k = sc.nextInt();
                                            sc.nextLine();
                                            switch (k) {
                                                case 1:
                                                    productList1.getListCategory(Category.CPU);
                                                    productList1.getAllCategory();
                                                    break;
                                                case 2:
                                                    productList1.getListCategory(Category.MAIN);
                                                    productList1.getAllCategory();
                                                    break;
                                                case 3:
                                                    productList1.getListCategory(Category.RAM);
                                                    productList1.getAllCategory();
                                                    break;
                                                case 4:
                                                    productList1.getListCategory(Category.VGA);
                                                    productList1.getAllCategory();
                                                    break;
                                                case 5:
                                                    productList1.getListCategory(Category.PSU);
                                                    productList1.getAllCategory();
                                                    break;
                                                case 6:
                                                    productList1.getListCategory(Category.SSD);
                                                    productList1.getAllCategory();
                                                    break;
                                                default:
                                                    System.out.println("Không có lựa chọn này!");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Hiển thị thông tin theo hãng! ");
                                            System.out.print("Nhập hãng bạn muốn tìm kiếm: ");
                                            String strb;
                                            strb = sc.next();
                                            productList1.getAllBrand(strb);
                                            break;
                                        case 4:
                                            System.out.println("Hiển thị thông tin theo mức giá!");
                                            Menu.choosePrice();
                                            int price;
                                            System.out.print("Nhập mức giá bạn muốn tìm: ");
                                            price = Integer.valueOf(sc.nextInt());
                                            productList1.getAllPrice(price);
                                            break;
                                        case 5:
                                            System.out.println("Tìm kiếm sản phẩm!");
                                            productList1.searchName();
                                            break;
                                        case 6:
                                            System.out.println("Thêm sản phẩm");
                                            Menu.chooseCatrgory();
                                            int z = sc.nextInt();
                                            sc.nextLine();
                                            switch (z) {
                                                case 1:
                                                    productList1.addNewProduct(Category.CPU);
                                                    break;
                                                case 2:
                                                    productList1.addNewProduct(Category.MAIN);
                                                    break;
                                                case 3:
                                                    productList1.addNewProduct(Category.RAM);
                                                    break;
                                                case 4:
                                                    productList1.addNewProduct(Category.VGA);
                                                    break;
                                                case 5:
                                                    productList1.addNewProduct(Category.PSU);
                                                    break;
                                                case 6:
                                                    productList1.addNewProduct(Category.SSD);
                                                    break;
                                            }

                                            break;
                                        case 7:
                                            System.out.println("Sửa sản phẩm: ");
                                            productList1.editProduct();
                                            break;
                                        case 8:
                                            System.out.println("Xóa sản phẩm!");
                                            productList1.deleteProduct();
                                            break;
                                        case 9:
                                            System.exit(0);
                                        default:
                                            System.out.println("Lựa chọn không đúng!");

                                    }
                                    } 
                                }catch (Exception e) {

                                        System.out.println("Bạn vừa nhập không phải một số! Xin mời lựa chọn lại!");
                                    
                                    }

                                
                            } else if (admin.equalsIgnoreCase("q")) {
                                System.exit(0);
                            } else {
                                System.out.println("Tên quản trị không đúng");
                            }
                            break;
                        case 2:
                            while (true) {
                                System.out.print("Mời bạn lựa chọn: ");
                                Menu.chooseGuest();
                                System.out.println("Lựa chọn của bạn là: ");
                                int c = sc.nextInt();
                                switch (c) {
                                    case 1:
                                        System.out.println("Tất cả sản phẩm là: ");
                                        productList1.getAllProduct();
                                        break;
                                    case 2:
                                        System.out.println("Lựa chọn danh mục bạn muốn in ra: ");
                                        Menu.chooseCatrgory();
                                        int k = sc.nextInt();
                                        sc.nextLine();
                                        switch (k) {
                                            case 1:
                                                productList1.getListCategory(Category.CPU);
                                                productList1.getAllCategory();
                                                break;
                                            case 2:
                                                productList1.getListCategory(Category.MAIN);
                                                productList1.getAllCategory();
                                                break;
                                            case 3:
                                                productList1.getListCategory(Category.RAM);
                                                productList1.getAllCategory();
                                                break;
                                            case 4:
                                                productList1.getListCategory(Category.VGA);
                                                productList1.getAllCategory();
                                                break;
                                            case 5:
                                                productList1.getListCategory(Category.PSU);
                                                productList1.getAllCategory();
                                                break;
                                            case 6:
                                                productList1.getListCategory(Category.SSD);
                                                productList1.getAllCategory();
                                                break;
                                            default:
                                                System.out.println("Không có lựa chọn này!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Hiển thị thông tin theo hãng! ");
                                        System.out.print("Nhập hãng bạn muốn tìm kiếm: ");
                                        String strb;
                                        strb = sc.next();
                                        productList1.getAllBrand(strb);
                                        break;
                                    case 4:
                                        System.out.println("Hiển thị thông tin theo mức giá!");
                                        Menu.choosePrice();
                                        int price;
                                        System.out.print("Nhập mức giá bạn muốn tìm: ");
                                        price = Integer.valueOf(sc.nextInt());
                                        productList1.getAllPrice(price);
                                        break;
                                    case 5:
                                        System.out.println("Tìm kiếm sản phẩm!");
                                        productList1.searchName();
                                        break;
                                    case 6:
                                        System.exit(0);

                                    default:
                                        System.out.println("Không có lựa chọn này!");
                                }
                            }
                        default:
                            System.out.println("Không có lựa chọn này!");
                    }
                } catch (Exception e) {
                    System.out.println("Bạn nhập không phải một số! Xin mời lựa chọn lại!");
                }

            } else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            }

            else {
                System.out.println("Xin mời nhập lại!");
            }

        }
    }

}
