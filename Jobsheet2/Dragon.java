public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection; 
        } else {
            System.out.println("Arah tidak valid! Gunakan 1(atas), 2(kanan), 3(bawah), atau 4(kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // arah atas, y bertambah 
                y += steps;
                break;
        
            case 2: // arah kanan, x bertambah
                x += steps; 
                break;

            case 3: // arah bawah, y berkurang
                y -= steps;
                break;

            case 4: // arah kiri, x berkurang
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arah;
        switch (direction) {
            case 1:
                arah = "Atas";
                break;

            case 2:
                arah = "Kanan";
                break;

            case 3:
                arah = "Bawah";
                break;

            case 4:
                arah = "Kiri";
                break;
        
            default:
                arah = "Tidak diketahui";
                break;
        }
        System.out.println("Posisi  : (" + x + ", " + y + ")");
        System.out.println("Arah    : " + arah);
    }
}