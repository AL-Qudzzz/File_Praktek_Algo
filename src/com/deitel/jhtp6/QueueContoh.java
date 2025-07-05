package com.deitel.jhtp6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Kelas ini mendemonstrasikan penggunaan Queue dengan tipe data Integer.
 * Contoh ini lebih sederhana untuk menunjukkan prinsip dasar FIFO (First-In, First-Out).
 */
public class QueueContoh {

    public static void main(String[] args) {
        // Membuat objek Queue menggunakan implementasi LinkedList
        // Kali ini, Queue akan menyimpan tipe data Integer (angka)
        Queue<Integer> antreanAngka = new LinkedList<>();

        System.out.println("--- Antrean Angka Dimulai ---");

        // 1. Menambahkan elemen (angka) ke dalam antrean (Enqueue)
        // Metode offer() akan menambahkan elemen ke akhir antrean.
        antreanAngka.offer(10);
        antreanAngka.offer(20);
        antreanAngka.offer(30);
        antreanAngka.offer(40);

        System.out.println("Angka telah ditambahkan ke antrean.");
        System.out.println("Isi antrean saat ini: " + antreanAngka);
        System.out.println("Ukuran antrean: " + antreanAngka.size());
        System.out.println();

        // 2. Melihat elemen pertama tanpa mengeluarkannya (Peek)
        // Metode peek() mengembalikan elemen di kepala (depan) antrean tanpa menghapusnya.
        // Akan mengembalikan null jika antrean kosong.
        Integer angkaDiDepan = antreanAngka.peek();
        System.out.println("Angka paling depan di antrean: " + angkaDiDepan);
        System.out.println("Isi antrean setelah 'peek': " + antreanAngka);
        System.out.println();

        // 3. Mengeluarkan elemen dari antrean (Dequeue)
        // Metode poll() mengambil dan menghapus elemen di kepala (depan) antrean.
        // Akan mengembalikan null jika antrean kosong.
        Integer angkaYangDikeluarkan = antreanAngka.poll();
        System.out.println("Angka '" + angkaYangDikeluarkan + "' dikeluarkan dari antrean.");
        System.out.println("Isi antrean sekarang: " + antreanAngka);
        System.out.println();

        // Mengeluarkan elemen berikutnya
        angkaYangDikeluarkan = antreanAngka.poll();
        System.out.println("Angka '" + angkaYangDikeluarkan + "' dikeluarkan dari antrean.");
        System.out.println("Isi antrean sekarang: " + antreanAngka);
        System.out.println();

        // 4. Mengosongkan sisa antrean menggunakan loop
        // Ini adalah cara umum untuk memproses semua item dalam sebuah queue.
        System.out.println("Mengeluarkan semua sisa elemen dari antrean:");
        while (!antreanAngka.isEmpty()) {
            angkaYangDikeluarkan = antreanAngka.poll();
            System.out.println("Angka '" + angkaYangDikeluarkan + "' dikeluarkan. Sisa antrean: " + antreanAngka);
        }
        System.out.println();

        System.out.println("--- Proses Selesai ---");
        System.out.println("Antrean sekarang kosong: " + antreanAngka.isEmpty());
    }
}
