package tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Anggota {
    private String noAnggota;
    private String nama;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Anggota(String noAnggota, String nama) {
        this.noAnggota = noAnggota;
        this.nama = nama;
        this.daftarPeminjaman = new ArrayList<>();
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPeminjamanBuku(Buku buku, LocalDate tanggal) {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTanggalPinjam(tanggal);
        peminjaman.setBuku(buku);
        daftarPeminjaman.add(peminjaman);
    }

    public String getInfo() {
        String info = "";
        info += "No Anggota : " + noAnggota + "\n";
        info += "Nama       : " + nama + "\n";
 
        if (!daftarPeminjaman.isEmpty()) {
            info += "Riwayat Peminjaman :\n";
            for (Peminjaman peminjaman : daftarPeminjaman) {
                info += "\t" + peminjaman.getInfo() + "\n";
            }
        } else {
            info += "Belum ada riwayat peminjaman";
        }
 
        return info;
    }
}