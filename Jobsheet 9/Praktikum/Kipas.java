public class Kipas extends AlatElektronik {
    public String jenis;

    public Kipas(double harga, String merk, String warna, String jenis) {
        super(harga, merk, warna);
        this.jenis = jenis;
    }

    @Override 
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis Kipas  : " + jenis;

        return info;
    }
}