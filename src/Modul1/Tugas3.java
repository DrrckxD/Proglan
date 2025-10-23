package Modul1;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilaiUjian = scanner.nextInt();


        String status = (nilaiUjian >= 60) ? "Lulus" : "Tidak Lulus";


        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Status Kelulusan: " + status);


        scanner.close();
    }
}
