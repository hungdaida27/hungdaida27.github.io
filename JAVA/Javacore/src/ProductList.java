import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {
    static List<Product> productList = new ArrayList<>();
    static List<Product> listCategory = new ArrayList<>();
    static List<Product> listAllProduct = new ArrayList<>();
    static String MYFILE = "Product.txt";

    public void addProduct() {
        File myFile = new File(MYFILE);
        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String s = myReader.nextLine();
                String str[] = s.split(" - ");
                String id = str[0];
                String name = str[1];
                String describe = str[2];
                int importPrice = Integer.parseInt(str[3]);
                int salePrice = Integer.parseInt(str[4]);
                int amount = Integer.parseInt(str[5]);
                int amountSale = Integer.parseInt(str[6]);
                String brand = str[7];
                Category ctr = null;
                if (str[8].equals("Vi xử lý")) {
                    ctr = Category.CPU;
                } else if (str[8].equals("Bo mạch chủ")) {
                    ctr = Category.MAIN;
                } else if (str[8].equals("Bộ nhớ")) {
                    ctr = Category.RAM;
                } else if (str[8].equals("Card đồ họa")) {
                    ctr = Category.VGA;
                } else if (str[8].equals("Nguồn máy tính")) {
                    ctr = Category.PSU;
                } else if (str[8].equals("Ổ cứng")) {
                    ctr = Category.SSD;
                }
                productList.add(new Product(id, name, describe, importPrice, salePrice, amount, amountSale, brand, ctr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getAllProduct() {
        productList.forEach(System.out::println);
    }

    public List<Product> getListCategory(Category category) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().equals(category)) {
                listCategory.add(productList.get(i));
            }
        }
        return listCategory;

    }

    public void getAllCategory() {
        listCategory.forEach(System.out::println);
    }

    public void getAllBrand(String brand) {
        int cout = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getBrand().equalsIgnoreCase(brand)) {
                System.out.println(productList.get(i).toString());
                cout++;
            }
        }
        System.out.println((cout == 0) ? "Không có sản phẩm này!" : "");

    }

    public void getAllPrice(int price) {

        int cout = 0;
        switch (price) {
            case 1:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getSalePrice() < 3000000) {
                        System.out.println(productList.get(i).toString());
                        cout++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < productList.size(); i++) {
                    if (3000000 <= productList.get(i).getSalePrice() && productList.get(i).getSalePrice() < 6000000) {
                        System.out.println(productList.get(i).toString());
                        cout++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < productList.size(); i++) {
                    if (6000000 <= productList.get(i).getSalePrice() && productList.get(i).getSalePrice() < 9000000) {
                        System.out.println(productList.get(i).toString());
                        cout++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < productList.size(); i++) {
                    if (9000000 <= productList.get(i).getSalePrice() && productList.get(i).getSalePrice() < 15000000) {
                        System.out.println(productList.get(i).toString());
                        cout++;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getSalePrice() >= 15000000) {
                        System.out.println(productList.get(i).toString());
                        cout++;
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        System.out.println((cout == 0) ? "Không có sản phẩm này" : "");
    }

    public void searchName() {
        System.out.print("Nhập tên bạn muốn tìm: ");
        String name1;
        Scanner sc = new Scanner(System.in);
        name1 = sc.nextLine();
        int cout = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name1)) {
                System.out.println(productList.get(i).toString());
                cout++;
            }
        }

        System.out.println((cout == 0) ? "Không có sản phẩm này" : "");
    }

    public void addNewProduct(Category category) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        String describe = sc.nextLine();
        System.out.print("Nhập giá nhập kho: ");
        int importPrice = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập giá bán: ");
        int salePrice = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int amount = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập số lượng bán: ");
        int amountSale = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập hãng: ");
        String brand = sc.nextLine();
        // System.out.print("Nhập danh mục: ");
        // Category cate = null;
        // String catr = sc.nextLine();
        // if (catr.equals("CPU")) {
        // cate = Category.CPU;
        // } else if (catr.equals("MAIN")) {
        // cate = Category.MAIN;
        // } else if (catr.equals("RAM")) {
        // cate = Category.RAM;
        // } else if (catr.equals("VGA")) {
        // cate = Category.VGA;
        // } else if (catr.equals("PSU")) {
        // cate = Category.MAIN;
        // } else if (catr.equals("SSD")) {
        // cate = Category.SSD;
        // }

        productList.add(new Product(id, name, describe, importPrice, salePrice, amount, amountSale, brand, category));
        System.out.println("Danh sách sau khi thêm: ");
        productList.forEach(System.out::println);
        writeFile();

    }

    public void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id cần sửa: ");
        String id = sc.nextLine();
        int cout = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().contains(id)) {
                System.out.println(productList.get(i).toString());
                System.out.print("Nhập tên mới: ");
                String name = sc.nextLine();
                productList.get(i).setName(name);
                System.out.print("Nhập mô tả mới: ");
                String describe = sc.nextLine();
                productList.get(i).setDescribe(describe);
                System.out.print("Nhập giá nhập mới: ");
                int importPrice = sc.nextInt();
                productList.get(i).setImportPrice(importPrice);
                System.out.print("Nhập giá bán mới: ");
                int salePrice = sc.nextInt();
                productList.get(i).setSalePrice(salePrice);
                System.out.print("Nhập số lượng mới: ");
                int amount = sc.nextInt();
                productList.get(i).setAmount(amount);
                System.out.print("Nhập số lượng bán mới: ");
                int amountSale = sc.nextInt();
                productList.get(i).setAmountSale(amountSale);
                sc.nextLine();
                System.out.print("Nhập hãng mới: ");
                String brand = sc.nextLine();
                productList.get(i).setBrand(brand);
                cout++;
                System.out.println("Sản phẩm sau khi sửa là: ");
                System.out.println(productList.get(i).toString());
            }
        }

        if (cout == 0) {
            System.out.println("Không tìm thấy sản phẩm");
        }
        writeFile();
    }

    public void deleteProduct() {
        System.out.println("Nhập id cần xóa: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().contains(id)) {
                System.out.println(productList.get(i).toString());
                productList.remove(productList.get(i));
                System.out.println("Xóa thành công!");
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm!");
            }
        }

        System.out.println("Danh sách sau khi xóa: ");
        productList.forEach(System.out::println);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(MYFILE);
            for (Product p : productList) {
                fileWriter.write(p.toString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
