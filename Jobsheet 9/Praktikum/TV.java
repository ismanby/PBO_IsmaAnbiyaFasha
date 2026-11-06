public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    public TV(double harga, String merk, String warna, String jenisLayar, int volume) {
        super(harga, merk, warna);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
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
        info += "Jenis Layar  : " + jenisLayar + "\n";
        info += "Volume       : " + volume;

        return info;
    }
}