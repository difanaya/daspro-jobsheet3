import java.util.Scanner;
public class Percepatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kecAwal, kecAkhir, waktu;

        System.out.print("Masukkan kecepatan awal =");
        kecAwal = sc.nextInt();
        System.out.print("Masukkan kecepatan akhir =");
        kecAkhir = sc.nextInt();
        System.out.print("Masukkan waktu =");
        waktu = sc.nextInt();

        double percepatan = (kecAkhir-kecAwal)/waktu;
        System.out.println("Percepatan = "+percepatan);
    }
    
}
