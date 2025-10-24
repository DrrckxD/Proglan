package Modul3.Tugas;

// NotaPemesanan.java
public class NotaPemesanan {
    private String namaPelanggan;
    private String makananPesanan;
    private String rasa; // Variasi rasa
    private int jumlah;
    private double hargaSatuan;
    private double totalHarga;

    // Konstruktor
    public NotaPemesanan(String namaPelanggan, String makananPesanan, String rasa, int jumlah, double hargaSatuan) {
        this.namaPelanggan = namaPelanggan;
        this.makananPesanan = makananPesanan;
        this.rasa = rasa;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        hitungTotalHarga();
    }

    // Method untuk menghitung total harga
    private void hitungTotalHarga() {
        this.totalHarga = jumlah * hargaSatuan;
    }

    // Method untuk mencetak nota
    public void cetakNota() {
        System.out.println("=====================================");
        System.out.println("Nota Pemesanan - Zillicious Restaurant");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Pesanan        : " + makananPesanan);
        System.out.println("Rasa           : " + rasa);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Harga Satuan   : Rp " + hargaSatuan);
        System.out.println("Total Harga    : Rp " + totalHarga);
        System.out.println("=====================================");
    }

    // Getter dan Setter
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getMakananPesanan() {
        return makananPesanan;
    }

    public void setMakananPesanan(String makananPesanan) {
        this.makananPesanan = makananPesanan;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        hitungTotalHarga();
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        hitungTotalHarga();
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}
