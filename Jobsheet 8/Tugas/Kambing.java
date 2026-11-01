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
 
    // Override concrete method: tambah info khusus Kambing
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Bertanduk     : " + (isBertanduk ? "Ya" : "Tidak"));
    }
 
    // Implementasi abstract method dari Hewan
    @Override
    public void bersuara() {
        System.out.println("Mbeeek");
    }
}