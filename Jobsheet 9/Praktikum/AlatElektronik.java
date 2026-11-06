public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public AlatElektronik(double harga, String merk, String warna) {
        this.harga = harga;
        this.merk = merk;
        this.warna = warna;
    }

    public String getInfo() {
        String info = "";
        info += "Harga        : Rp " + harga + "\n";
        info += "Merk         : " + merk +"\n";
        info += "Warna        : " + warna + "\n";

        return info;
    }
}