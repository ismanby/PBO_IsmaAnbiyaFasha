public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

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
        if (angsuran >= 0.1 * jumlahPinjaman) {
            jumlahPinjaman -= angsuran;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}