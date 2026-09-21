package tugas;

import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private Buku buku;

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal Pinjam: " + tanggalPinjam;
        info += ", Buku: " + buku.getJudul();
        info += ", Status: " + (tanggalKembali == null ? "Belum dikembalikan" : "Dikembalikan pada " + tanggalKembali);

        return info;
    }
}