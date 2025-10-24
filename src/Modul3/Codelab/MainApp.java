package Modul3.Codelab;

import java.util.Scanner;

public class MainApp {
    static class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Selamat datang di Zillicious Restaurant!");
        System.out.println("Pesan Creampuff Zillicious!");


        System.out.println("Pilih rasa creampuff:");
        System.out.println("1. Vanilla");
        System.out.println("2. Chocolate");
        System.out.println("3. Cappuccino");
        System.out.println("4. Matcha");
        System.out.println("5. Durian");


        System.out.print("Masukkan pilihan rasa (1-5): ");
        int pilihanRasa = scanner.nextInt();
        scanner.nextLine();


        String rasa = "";
        switch (pilihanRasa) {
            case 1:
                rasa = "Vanilla";
                break;
            case 2:
                rasa = "Chocolate";
                break;
            case 3:
                rasa = "Cappuccino";
                break;
            case 4:
                rasa = "Matcha";
                break;
            case 5:
                rasa = "Durian";
                break;
            default:
                System.out.println("Pilihan tidak valid, default ke rasa Vanilla.");
                rasa = "Vanilla";
                break;
        }

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Jumlah Creampuff yang Dipesan: ");
        int jumlah = scanner.nextInt();
        double hargaSatuan = 23000.0;

        Modul3.Tugas.NotaPemesanan nota = new Modul3.Tugas.NotaPemesanan(namaPelanggan, "Creampuff Zillicious", rasa, jumlah, hargaSatuan);


        nota.cetakNota();
        scanner.close();
    }
}
}
