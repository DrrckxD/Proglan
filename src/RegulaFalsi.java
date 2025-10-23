import java.util.Scanner;

public class RegulaFalsi {

    // Fungsi yang ingin kita cari akarnya
    public static double f(double x) {
        // Contoh persamaan non-linier: x^3 - x - 2 = 0
        return Math.pow(x, 3) - x - 2;
    }

    // Metode Regula Falsi dengan iterasi yang ditampilkan
    public static double regulaFalsi(double a, double b, double epsilon) {
        double c = a;
        int iterasi = 1;

        // Memastikan bahwa tanda fungsi pada titik a dan b berbeda
        if (f(a) * f(b) >= 0) {
            System.out.println("Tidak dapat digunakan, karena f(a) dan f(b) memiliki tanda yang sama.");
            return Double.NaN;  // Return NaN jika f(a) dan f(b) memiliki tanda yang sama
        }

        // Proses iterasi sampai error lebih kecil dari epsilon
        while ((b - a) >= epsilon) {
            // Hitung titik tengah
            c = a - (f(a) * (b - a)) / (f(b) - f(a));

            // Menampilkan iterasi dan nilai c
            System.out.printf("Iterasi %d: a = %.6f, b = %.6f, c = %.6f, f(c) = %.6f\n", iterasi, a, b, c, f(c));

            // Periksa apakah c adalah akar persamaan
            if (f(c) == 0.0) {
                break;
            }

            // Menentukan interval baru
            if (f(c) * f(a) < 0) {
                b = c;
            } else {
                a = c;
            }

            iterasi++; // Menambah nomor iterasi
        }

        // Mengembalikan hasil akar persamaan
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai a, b, dan epsilon (error toleransi)
        System.out.println("Masukkan nilai batas bawah a:");
        double a = scanner.nextDouble();

        System.out.println("Masukkan nilai batas atas b:");
        double b = scanner.nextDouble();

        System.out.println("Masukkan toleransi kesalahan epsilon:");
        double epsilon = scanner.nextDouble();

        // Panggil metode Regula Falsi untuk mencari akar
        double akar = regulaFalsi(a, b, epsilon);

        // Menampilkan hasil
        if (!Double.isNaN(akar)) {
            System.out.println("Akar persamaan adalah: " + akar);
        }

        scanner.close();
    }
}
