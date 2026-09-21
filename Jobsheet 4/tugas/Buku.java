package tugas;

public class Buku {
    private String isbn;
    private String judul;
    private int stok;

    public Buku(String isbn, String judul, int stok) {
        this.isbn = isbn;
        this.judul = judul;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getInfo() {
        return "Judul: " + judul + " | ISBN: " + isbn + " | Stok: " + stok;
    }
}