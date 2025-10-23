package Modul2.Demo.Tugas3.After;

public class Main {
    public static final int KALORI_PER_KM = 50;

    public static void main(String[] args) {  //Move Member Method
        AktivitasOlahraga2 olahraga = new AktivitasOlahraga2("Berlari", 30, 5, 300);
        olahraga.tampilkanInfo();
        olahraga.calculateTimePerKilometer();
        olahraga.setKalori(KALORI_PER_KM * olahraga.getJarak());  //Inline Method & Introduce Constant Method
        System.out.println("Kalori yang terbakar: " + olahraga.getKalori() + " kalori");
    }
}
