public class Mobil implements Moveable {
    @Override 
    public void maju() {
        System.out.println("Mobil bergerak maju menelusuri jalanan.");
    }

    @Override 
    public void berhenti() {
        System.out.println("Mobil menginjak rem dan berhenti.");
    }

    public void klakson() {
        System.out.println("Mobil membunyikan klakson: Tin Tiin!");
    }
}