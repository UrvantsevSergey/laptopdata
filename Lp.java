public class Lp {
    int id;
    int ram;
    int hd_v;
    String os;
    String color;

    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", ram=" + ram +
                "GB" +
                ", hd_v=" + hd_v +
                "GB" +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lp laptop = (Lp) obj;
        return id == laptop.id &&
                ram == laptop.ram &&
                hd_v == laptop.hd_v &&
                os.equals(laptop.os) &&
                color.equals(laptop.color);
    }
}