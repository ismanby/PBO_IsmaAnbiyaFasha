public class Main {
    public static void main(String[] args) {
        System.out.println("=== AKSI MOBIL ===");
        Mobil mobil1 = new Mobil();
        mobil1.maju();
        mobil1.klakson();
        mobil1.berhenti();

        System.out.println("\n=== AKSI HARIMAU ===");
        Harimau harimau1 = new Harimau();
        harimau1.maju();
        harimau1.bersuara();
        harimau1.makan();
        harimau1.berhenti();
    }
}