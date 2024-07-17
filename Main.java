import java.util.Arrays;
import java.util.HashSet;
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

        Set<Lp> laptops = new HashSet<Lp>(Arrays.asList(laptop1, laptop2, laptop3));
        System.out.println(laptops);
        

    }
}
