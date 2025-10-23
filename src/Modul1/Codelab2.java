package Modul1;

import java.util.Scanner;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class Codelab2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();

            try {
                validasiUsia(usia);
                System.out.println("Usia yang dimasukkan valid: " + usia);
            } catch (InvalidAgeException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }
        }

        public static void validasiUsia(int usia) throws InvalidAgeException {
            if (usia <= 0 || usia >= 120) {
                throw new InvalidAgeException("Usia tidak valid! Usia harus lebih besar dari 0 dan kurang dari 120.");
            }
        }
    }


