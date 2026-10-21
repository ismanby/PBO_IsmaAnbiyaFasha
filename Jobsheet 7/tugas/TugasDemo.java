package tugas;

public class TugasDemo {
    public static void main(String[] args) {
        System.out.println("=== INFO AYAM ===");
        Ayam ayam1 = new Ayam(2, true, true);
        ayam1.tampilInfo();
        System.out.print("Suara Ayam    : ");
        ayam1.berkokok();

        System.out.println("\n=== INFO KAMBING ===");
        Kambing kambing1 = new Kambing(4, false, false, true);
        kambing1.tampilInfo();
    }
}