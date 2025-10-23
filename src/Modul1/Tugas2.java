package Modul1;

import java.util.Scanner;


class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan angka positif: ");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);


                if (number <= 0) {
                    throw new InvalidNumberException("Input harus angka positif, tetapi Anda memasukkan: " + number);
                }

                System.out.println("Angka yang dimasukkan adalah angka positif: " + number);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Error: Input bukan angka. Harap masukkan angka.");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
