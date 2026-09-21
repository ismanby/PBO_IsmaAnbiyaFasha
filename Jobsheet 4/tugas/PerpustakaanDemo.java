package tugas;

import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("978-602-1", "Belajar Java Dasar", 5);
        Buku buku2 = new Buku("978-602-2", "Konsep OOP", 3);

        Anggota anggota1 = new Anggota("A001", "Andi");
        anggota1.tambahPeminjamanBuku(buku1, LocalDate.of(2026, 9, 1));
        anggota1.tambahPeminjamanBuku(buku2, LocalDate.of(2026, 9, 10));

        System.out.println(anggota1.getInfo());

        Anggota anggota2 = new Anggota("A002", "Budi");
        System.out.println(anggota2.getInfo());
    }
}