public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public Kulkas(double harga, String merk, String warna, int jumlahPintu) {
        super(harga, merk, warna);
        this.jumlahPintu = jumlahPintu;
    }

    @Override 
    public String getInfo() {
        String info = super.getInfo();
        info += "Jumlah Pintu : " + jumlahPintu;

        return info;
    }
}