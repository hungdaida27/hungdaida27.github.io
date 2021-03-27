import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class HelloWorld {

    
    public static void main(String[] args) {
        System.out.println("Toi ten la Hung");
        String str = "    Hello    ";
        System.out.println(str.toLowerCase()); //chuyen chu thuong thanh chu hoa
        System.out.println(str.toUpperCase()); //chuyen tat ca thanh chu thong
        System.out.println(str.trim()); // xoa khoang trang

        String s1 = "Java";
        String s2 = "HTML";
        String s = "JAVA";

        System.out.println(s.length());
        System.out.println(s.equals(s2));

        enum
        Season{WINTER,SPRING,AUTUM,SUMMER

            

        }
        Season season = Season.SPRING;
        System.out.println(season);

        //lay ngay hien tai

        LocalDate currDate = LocalDate.now();
        System.out.println(currDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormat = currDate.format(dateTimeFormatter);
        System.out.println(dateFormat);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int h = 5;
        float b = h;
        System.out.println(b);
        System.out.println("\n");
        
        double j = 5.6;
        int i = (int) j;
        System.out.println(i);
        
        Scanner scanner = new Scanner(System.in);


        int tuoi;

        System.out.println("Nhap ten cua ban: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi cua ban: ");
        tuoi = scanner.nextInt();
        System.out.println("Nhap dia chi cua ban: ");
        String diachi = scanner.nextLine();
        System.out.println(" Ten cua ban la: " +ten);
        System.out.println("Tuoi cua ban la: " +tuoi);
        System.out.println("Dia chi cua ban la: "+diachi);


    }
}
