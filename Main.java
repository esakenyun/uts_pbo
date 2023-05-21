package uts_pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aspirasi a1 = new Aspirasi();
        LayananAspirasi deskripsi = new LayananAspirasi();

        System.out.println("===Program Aspirasi Mahasiswa===");
        System.out.print("Masukkan Nama Anda\t: ");
        a1.setNama(input.nextLine());
        System.out.print("Masukkan NIM Anda\t: ");
        a1.setNim(input.nextLine());
        System.out.print("Masukkan Aspirasi Anda\t: ");
        deskripsi.setDeskripsi(input.nextLine());

        System.out.println("\n======================================================");
        System.out.println("\n===Nama dan Hasil Aspirasi===");
        System.out.println("Nama\t\t: " + a1.getNama());
        System.out.println("NIM\t\t: " + a1.getNim());
        System.out.println("Aspirasi\t: " + "\" " + deskripsi.getDeskripsi() + " \"");
        System.out.print("Keterangan\t: ");
        deskripsi.tentangAspirasi();
    }
}