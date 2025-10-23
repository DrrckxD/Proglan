package Modul2.Demo.Tugas3.Before;

import Modul2.Demo.Tugas3.After.AktivitasOlahraga2;

public class AktivitasOlahraga {
    public String nama;
    public double waktu; // waktu dalam menit
    public double jarak; // jarak dalam kilometer
    public double kalori; // kalori yang terbakar

    public AktivitasOlahraga(String nama, double waktu, double jarak, double kalori) {
        this.nama = nama;
        this.waktu = waktu;
        this.jarak = jarak;
        this.kalori = kalori;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Aktivitas: " + nama);
        System.out.println("Waktu: " + waktu + " menit");
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Kalori yang terbakar: " + kalori + " kalori");
    }

    public void waktuPerKilometer() {
        double waktuPerKm = waktu / jarak;
        System.out.println("Waktu per kilometer: " + waktuPerKm + " menit");
    }

    public void hitungKalori() {
        kalori = 50 * jarak;  // asumsikan 50 kalori per km
        System.out.println("Kalori yang terbakar: " + kalori + " kalori");
    }

    public static void main(String[] args) {
        AktivitasOlahraga2 olahraga = new AktivitasOlahraga2("Berlari", 30, 5, 300);
        olahraga.tampilkanInfo();
        olahraga.calculateTimePerKilometer();
        olahraga.setKalori(50 * olahraga.getJarak());  // asumsikan 50 kalori per km
        System.out.println("Kalori yang terbakar: " + olahraga.getKalori() + " kalori");
    }
}
