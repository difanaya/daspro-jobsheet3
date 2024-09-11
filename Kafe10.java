import java.util.Scanner;
public class Kafe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga;
        double nominalBayar;
        float diskon = 10 / 100f;
        //f sebagai float , kalau tdk mau pakai f bisa (10 / 100.0) yaitu .0 sbg double

        //double diskon = 10/100.0; atau 0,1 langsung
        //double harga = 150000;
        //maka hasilnya nanti 15000.0


        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaam pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp. " + nominalBayar);
        input.close();
    }
    
}
