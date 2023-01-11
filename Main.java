import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Laptop Apple_MacBook_Pro_14 = new Laptop("Apple MacBookPro 14 , Цена: 156 999р", 14.2, "Liquid Retina XDR", 
        true, 512, "16", "macOS", "space gray"); 

        Laptop Игровой_Thunderobot_911_Air_D = new Laptop("Игровой Thunderobot 911 Air D, Цена: 59 999р", 15.6, "AHVA", 
        true, 256, "8", "Windows", "black");

        Laptop Ноутбук_игровой_MSI_Vector_GP76 = new Laptop("Ноутбук игровой MSI Vector GP76, Цена: 209 999р", 17.3, "IPS", 
        true, 1, "32", "Windows", "black");

        Laptop Ноутбук_HUAWEI_MateBook_X_Pro = new Laptop("Ноутбук HUAWEI MateBook X Pro, Цена: 131 999р", 14.2, "LTPS", 
        false, 1, "16", "Windows", "white");

// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(Apple_MacBook_Pro_14);      
        laptop.add(Игровой_Thunderobot_911_Air_D);
        laptop.add(Ноутбук_игровой_MSI_Vector_GP76);
        laptop.add(Ноутбук_HUAWEI_MateBook_X_Pro);

// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}