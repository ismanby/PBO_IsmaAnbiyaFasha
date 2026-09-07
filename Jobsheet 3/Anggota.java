public class Anggota {
    private String noKtp;
    private String nama;
    int limitPinjaman;
    int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNoKtp() {
        return noKtp;
    }
    
    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int pinjaman) {
        if (jumlahPinjaman + pinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += pinjaman;
        }
    }

    public void angsur(int angsuran) {
        jumlahPinjaman -= angsuran;
    }
}