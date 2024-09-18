import java.util.Scanner;
public class PraktekDaspro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Kondisi Perkotaan
        double kecepatanKota, durasiKota, kapasitasMesin, faktorKota = 0.5;

        //a. input 
        System.out.print("Masukkan kapasitas mesin anda = ");
        kapasitasMesin = sc.nextDouble();
        System.out.println("Mencari Total Konsumsi Bahan Bakar di Perkotaan");
        System.out.print("Masukkan kecepatan = ");
        kecepatanKota = sc.nextDouble();
        System.out.print("Masukkan durasi = ");
        durasiKota = sc.nextDouble();
        
        
        //b. hitung jarak tempuh 
        double jarakTempuhKota = kecepatanKota*durasiKota;

        //c. hitung konsumsi bahan bakar
        double konsumsiBahanBakarKota = (jarakTempuhKota/100)*kapasitasMesin*faktorKota;

        //d. output konsumsi bahan bakar 
        System.out.println("Konsumsi bahan bakar di perkotaan = "+konsumsiBahanBakarKota+ " liter");



        //2. Kondisi Tol
        double kecepatanTol, durasiTol, faktorTol = 0.3;

        //a. input 
        System.out.println("Mencari Total Konsumsi Bahan Bakar di Tol");
        System.out.print("Masukkan kecepatan = ");
        kecepatanTol = sc.nextDouble();
        System.out.print("Masukkan durasi = ");
        durasiTol = sc.nextDouble();
        
        
        //b. hitung jarak tempuh 
        double jarakTempuhTol = kecepatanTol*durasiTol;

        //c. hitung konsumsi bahan bakar
        double konsumsiBahanBakarTol = (jarakTempuhTol/100)*kapasitasMesin*faktorTol;

        //d. output konsumsi bahan bakar 
        System.out.println("Konsumsi bahan bakar di tol = "+konsumsiBahanBakarTol+" liter");



        //3. Kondisi Pegunungan
        double kecepatanPegunungan, durasiPegunungan, faktorPegunungan = 0.7;

        //a. input 
        System.out.println("Mencari Total Konsumsi Bahan Bakar di Pegunungan");
        System.out.print("Masukkan kecepatan = ");
        kecepatanPegunungan = sc.nextDouble();
        System.out.print("Masukkan durasi = ");
        durasiPegunungan = sc.nextDouble();
        
        
        //b. hitung jarak tempuh 
        double jarakTempuhPegunungan = kecepatanPegunungan*durasiPegunungan;

        //c. hitung konsumsi bahan bakar
        double konsumsiBahanBakarPegunungan = (jarakTempuhPegunungan/100)*kapasitasMesin*faktorPegunungan;

        //d. output konsumsi bahan bakar 
        System.out.println("Konsumsi bahan bakar di pegunungan = "+konsumsiBahanBakarPegunungan+" liter");


        
        //4. Total Konsumsi Bahan Bakar di Semua Segmen
        double totalKonsumsi = konsumsiBahanBakarKota+konsumsiBahanBakarPegunungan+konsumsiBahanBakarTol;
        System.out.println("Total Konsumsi Bahan Bakar = "+totalKonsumsi+ " liter");



        //5. Rata-Rata Konsumsi Bahan Bakar yang Dibutuhkan per KM
        double totalJarak = jarakTempuhKota+jarakTempuhPegunungan+jarakTempuhTol;
        double rataBahanBakar = totalKonsumsi/totalJarak;
        System.out.println("Rata Konsumsi Bahan Bakar = "+rataBahanBakar+ " liter/km");


        //6. Persentase Konsumsi
        //a. input 
        double targetBahanBakar;
        System.out.print("Masukkan Target Bahan Bakar Harian = ");
        targetBahanBakar = sc.nextDouble();

        //b. hitung persentase konsumsi
        double persenKonsumsi = totalKonsumsi/targetBahanBakar*100;

        //c. output hasil persentase
        System.out.println("Persentase Konsumsi Bahan Bakar = "+persenKonsumsi+"%");

    }
    
}
