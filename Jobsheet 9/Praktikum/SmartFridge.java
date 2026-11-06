public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    public SmartFridge(double harga, String merk, String warna, int jumlahPintu, int volume, String ukuranLayar) {
        super(harga, merk, warna, jumlahPintu);
        this.volume = volume;
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override 
    public String getInfo() {
        String info = super.getInfo();
        info += "Volume       : " + volume;
        info += "Ukuran Layar : " + ukuranLayar;

        return info;
    }
}