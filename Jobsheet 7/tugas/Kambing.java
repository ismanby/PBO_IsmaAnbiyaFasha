package tugas;

public class Kambing extends Hewan {
    public boolean isBertanduk;

    public Kambing() {
        super(4, true, true); // Default: berkaki 4, berbulu, dan jantan
        this.isBertanduk = true;
    }

    public Kambing(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin, boolean isBertanduk) {
        super(jumlahKaki, isBerbulu, jenisKelamin);
        this.isBertanduk = isBertanduk;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Bertanduk     : " + (isBertanduk ? "Ya" : "Tidak"));
    }
}