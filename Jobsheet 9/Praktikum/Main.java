public class Main {
    public static void main(String[] args) {
        System.out.println("=== INFO KULKAS ===");
        Kulkas kulkas1 = new Kulkas(4000000, "Polytron", "Silver", 2);
        System.out.println(kulkas1.getInfo());

        System.out.println("\n=== INFO TV ===");
        TV tv1 = new TV(5600000, "Samsung", "Hitam", "OLED", 20);
        System.out.println(tv1.getInfo());

        System.out.println("\n-- Menaikkan Volume TV --");
        tv1.naikkanVolume();
        System.out.println("Volume TV sekarang: " + tv1.volume);
    }
}