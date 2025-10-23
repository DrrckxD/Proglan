package Modul2.Demo.Tugas3.After;

public class AktivitasOlahraga2 {
    private String nama;
    private double waktu; // Encapsulation Fields Method
    private double jarak; // Encapsulation Fields Method
    private double kalori; // Encapsulation Fields Method

    public AktivitasOlahraga2(String nama, double waktu, double jarak, double kalori) {
        this.setNama(nama);
        this.setWaktu(waktu);
        this.setJarak(jarak);
        this.setKalori(kalori);
    }

    public void tampilkanInfo() {
        printActivityDetails(); //Extract Method
    }

    private void printActivityDetails() {
        System.out.println("Nama Aktivitas: " + getNama());
        System.out.println("Waktu: " + getWaktu() + " menit");
        System.out.println("Jarak: " + getJarak() + " km");
    }

    public void calculateTimePerKilometer() { //Rename Method
        double waktuPerKm = hitungWaktuPerKm(); //Extract Method
        System.out.println("Waktu per kilometer: " + waktuPerKm + " menit");
    }

    private double hitungWaktuPerKm() {
        return getWaktu() / getJarak();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public double getKalori() {
        return kalori;
    }

    public void setKalori(double kalori) {
        this.kalori = kalori;
    }
}
