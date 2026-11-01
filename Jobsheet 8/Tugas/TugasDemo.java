public class TugasDemo {
    public static void main(String[] args) {
        // Hewan hewan = new Hewan();  // ERROR: Hewan adalah abstract class, tidak bisa di-instansiasi
 
        System.out.println("=== INFO AYAM ===");
        Ayam ayam1 = new Ayam(2, true, true);
        ayam1.tampilInfo();
        System.out.print("Suara Ayam    : ");
        ayam1.bersuara();
 
        System.out.println("\n=== INFO KAMBING ===");
        Kambing kambing1 = new Kambing(4, false, false, true);
        kambing1.tampilInfo();
        System.out.print("Suara Kambing : ");
        kambing1.bersuara();
    }
}