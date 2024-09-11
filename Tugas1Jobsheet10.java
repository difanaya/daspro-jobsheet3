import java.util.Scanner;

public class Tugas1Jobsheet10 {
public static void main(String[] args) {
    // Membuat Scanner untuk membaca input dari pengguna
    Scanner scanner = new Scanner(System.in);

    // Mengambil input dari pengguna
    System.out.print("Masukkan jumlah jam kerja per bulan: ");
    double jamKerja = scanner.nextDouble();

    System.out.print("Masukkan upah per jam: ");
    double upahPerJam = scanner.nextDouble();

    // Menghitung gaji bulanan sebelum pajak
    double gajiBulananSebelumPajak = jamKerja * upahPerJam;

    // Menghitung bonus
    double bonus = 0.10 * gajiBulananSebelumPajak;

    // Menghitung total gaji sebelum pajak
    double totalGajiSebelumPajak = gajiBulananSebelumPajak + bonus;

    // Menghitung pajak
    double pajak = 0.05 * totalGajiSebelumPajak;

    // Menghitung gaji bulanan setelah pajak
    double gajiBulananSetelahPajak = totalGajiSebelumPajak - pajak;

    // Menampilkan hasil
    System.out.printf("Gaji Bulanan Sebelum Pajak: %.2f\n", gajiBulananSebelumPajak);
    System.out.printf("Bonus: %.2f\n", bonus);
    System.out.printf("Total Gaji Sebelum Pajak: %.2f\n", totalGajiSebelumPajak);
    System.out.printf("Pajak: %.2f\n", pajak);
    System.out.printf("Gaji Bulanan Setelah Pajak: %.2f\n", gajiBulananSetelahPajak);

    // Menutup scanner
    scanner.close();
}
}