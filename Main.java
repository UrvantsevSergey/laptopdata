import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Main {
    public static void main(String[] args) {
        Lp laptop1 = new Lp();
        laptop1.id = 1;
        laptop1.ram = 8;
        laptop1.hd_v = 128;
        laptop1.os = "Windows 10";
        laptop1.color = "Black";

        Lp laptop2 = new Lp();
        laptop2.id = 2;
        laptop2.ram = 16;
        laptop2.hd_v = 256;
        laptop2.os = "MacOS";
        laptop2.color = "Silver";

        Lp laptop3 = new Lp();
        laptop3.id = 3;
        laptop3.ram = 32;
        laptop3.hd_v = 512;
        laptop3.os = "Linux";
        laptop3.color = "Gold";

        Lp laptop4 = new Lp();
        laptop4.id = 4;
        laptop4.ram = 32;
        laptop4.hd_v = 512;
        laptop4.os = "Linux";
        laptop4.color = "Gold";

        System.out.println("Добро пожаловать в базу данных магазина электроники");
        Set<Lp> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        System.out.println("Доступные ноутбуки:");
        laptops.forEach(System.out::println);

        Map<Integer, String> list = new HashMap<>();
        list.put(1, "ОЗУ");
        list.put(2, "Объём ЖД");
        list.put(3, "Операционная система");
        list.put(4, "Цвет");

        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Критерий: " + list.get(choice));
        System.out.println("Найденные ноутбуки:");
        for (Lp laptop : laptops) {
            switch (choice) {
                case 1:
                    System.out.println("ID: " + laptop.id + " RAM: " + laptop.ram);
                    break;
                case 2:
                    System.out.println("ID: " + laptop.id + " Hard Drive Volume: " + laptop.hd_v);
                    break;
                case 3:
                    System.out.println("ID: " + laptop.id + " Operating System: " + laptop.os);
                    break;
                case 4:
                    System.out.println("ID: " + laptop.id + " Color: " + laptop.color);
                    break;
                default:
                    System.out.println("Неверный выбор критерия.");
            }
        }


        System.out.println("По каким критериям отфильтровать ноутбуки: ");
        Map<Integer, String> list2 = new HashMap<Integer, String>();
        list2.put(1, "ОЗУ");
        list2.put(2, "Объём ЖД");
        System.out.println(list2);
        int ch_f = scanner.nextInt();
        if (ch_f == 1) {
            System.out.println("Введите объём ОЗУ (в ГБ): ");
            int ram = scanner.nextInt();
            
            int minRam = Integer.MAX_VALUE; 
            int min_id = 0;
            for (Lp laptop : laptops) {
                if (laptop.ram == ram) {
                    System.out.println("ID: " + laptop.id + " RAM: " + laptop.ram +"Гб");
                }

            //    else {
            //         for (Lp elem : laptops) {
            //             if (elem.ram < minRam) {
            //                 minRam = elem.ram;
            //                 min_id = elem.id;
            //             }
            //         }
                //}
             }
            // System.out.println("Минимальный объем RAM: " + minRam + "Гб" + " ID: " + min_id);
            
            
        }
        // if (ch_f == 2) {
        //     System.out.println("Введите объём ЖД (в ГБ): ");
        //     int hdd = scanner.nextInt();
        //     System.out.println("Найденные ноутбуки с объемом ЖД " + hdd + " ГБ:");
        //     for (Lp laptop : laptops) {
        //         if (laptop.hd_v == hdd) {
        //             System.out.println("ID: " + laptop.id + " ЖД: " + laptop.hd_v);
                }
            }
//         }
//         System.out.println("Спасибо за внимание!");
//     }
// }
