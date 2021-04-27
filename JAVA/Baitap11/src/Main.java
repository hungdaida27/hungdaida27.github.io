import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Waiter> waiters = new ArrayList<Waiter>();
        List<Kitchen> kitchens = new ArrayList<Kitchen>();
        waiters.add(new Waiter(01, 25, 500000, "Hung", 200000));
        waiters.add(new Waiter(02, 22, 600000, "Dung", 300000));
        waiters.add(new Waiter(03, 20, 550000, "Tung", 250000));
        waiters.add(new Waiter(04, 27, 520000, "Son", 220000));
        kitchens.add(new Kitchen(05, 24, 600000, "Hai", 320000));
        kitchens.add(new Kitchen(06, 28, 600000, "Phu", 340000));
        kitchens.add(new Kitchen(07, 30, 600000, "Linh", 200000));

        System.out.println("Thong tin nhan vien la:");
        System.out.println("Boi ban");
        waiters.forEach(n -> System.out.println(n));
        System.out.println("Dau bep");
        kitchens.forEach(n -> System.out.println(n));

        ///Sap xep
        System.out.println("Boi ban!!!");
        System.out.println("Sap xep theo ten: ");
        waiters.sort((Waiter h1, Waiter h2) -> h1.getName().compareTo(h2.getName()));
        waiters.forEach(n -> System.out.println(n));
        System.out.println("Sap xep theo luong: ");
        waiters.sort((Waiter l1, Waiter l2) -> l1.calculatorSalary() > l2.calculatorSalary() ? 1 : -1);
        waiters.forEach(n -> System.out.println(n));

        System.out.println("Dau bep!!!");
        System.out.println("Sap xep theo ten: ");
        kitchens.sort((Kitchen h1, Kitchen h2) -> h1.getName().compareTo(h2.getName()));
        kitchens.forEach(n -> System.out.println(n));
        System.out.println("Sap xep theo luong: ");
        kitchens.sort((Kitchen l1, Kitchen l2) -> l1.calculatorSalary() > l2.calculatorSalary() ? 1 : -1);
        kitchens.forEach(n -> System.out.println(n));
    }
    
}
