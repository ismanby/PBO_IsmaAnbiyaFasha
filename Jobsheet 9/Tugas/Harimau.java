public class Harimau implements Moveable {
    @Override
    public void maju() {
        System.out.println("Harimau melangkah maju dengan tatapan tajam.");
    }

    @Override 
    public void berhenti() {
        System.out.println("Harimau berhenti melangkah dan bersiaga.");
    }

    public void bersuara() {
        System.out.println("Harimau mengaum: ROOAAARRR!");
    }

    public void makan() {
        System.out.println("Harimau sedang menyantap mangsanya.");
    }
}