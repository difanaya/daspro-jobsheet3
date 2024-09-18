import java.util.Scanner;

public class Bunga2Persen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabunganAwal, lamaMenabung;
        double tabunganAkhir, bunga, persenBunga = 0.02;

        System.out.print("Berapa tabungan awal anda: ");
        tabunganAwal = sc.nextInt();
        System.out.print("Berapa lama anda menabung: ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung*persenBunga*tabunganAwal;
        tabunganAkhir = bunga + tabunganAwal;

        System.out.println("Bunga anda adalah: "+ bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: "+tabunganAkhir);

    }
    
}
