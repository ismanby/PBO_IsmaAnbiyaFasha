public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        System.out.println("===========================================================");
        System.out.println("Dragon 1 status awal:");
        dragon1.printStatus();
        System.out.println("-----------------------");

        dragon1.move(2);
        System.out.println("Dragon 1 setelah berpindah 2 langkah");
        dragon1.printStatus();
        System.out.println("-----------------------");

        dragon1.changeDirection(3); 
        dragon1.move(4);
        System.out.println("Dragon 1 setelah ganti ke arah bawah & berpindah 4 langkah");
        dragon1.printStatus();
        System.out.println("===========================================================");

        Dragon dragon2 = new Dragon();
        System.out.println("Dragon 2 status awal:");
        dragon2.printStatus();
        System.out.println("-----------------------");

        dragon2.changeDirection(4);
        dragon2.move(5);
        System.out.println("Dragon 2 setelah ganti ke arah kiri & berpindah 5 langkah");
        dragon2.printStatus();
        System.out.println("-----------------------");

        dragon2.changeDirection(5); 
        dragon2.move(2);
        System.out.println("Dragon 2 setelah ganti arah tidak valid & berpindah 2 langkah");
        dragon2.printStatus();
        System.out.println("===========================================================");
    }
}