package tugas;

public class Hewan {
    public int jumlahKaki;
    public boolean isBerbulu;
    public boolean jenisKelamin;

    public Hewan() {
    }

    public Hewan(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin) {
        this.jumlahKaki = jumlahKaki;
        this.isBerbulu = isBerbulu;
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilInfo() {
        System.out.println("Jumlah Kaki   : " + jumlahKaki);
        System.out.println("Berbulu       : " + (isBerbulu ? "Ya" : "Tidak"));
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Jantan" : "Betina"));
    }
}