package tugas;

public class Ayam extends Hewan {
    public Ayam() {
        super(2, true, true); // Default: berkaki 2, berbulu, dan jantan
    }

    public Ayam(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin) {
        super(jumlahKaki, isBerbulu, jenisKelamin);
    }

    public void berkokok() {
        System.out.println("Kukuruyukk");
    }
}