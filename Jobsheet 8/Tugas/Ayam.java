public class Ayam extends Hewan {
    public Ayam() {
        super(2, true, true); // Default: berkaki 2, berbulu, dan jantan
    }
 
    public Ayam(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin) {
        super(jumlahKaki, isBerbulu, jenisKelamin);
    }
 
    // Implementasi abstract method dari Hewan
    @Override
    public void bersuara() {
        System.out.println("Kukuruyukk");
    }
}