import java.util.Scanner;
public class TarifListrik {
    public static void main(String[] args) {
        int totalPenggunaanListrik;
        int tarif = 1500;

        //1:input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total penggunaan listrik: ");
        totalPenggunaanListrik = input.nextInt();
        
        //2: hitung tarif
        double totalTarif = tarif*totalPenggunaanListrik;
        boolean pengecekan = totalPenggunaanListrik > 500; 

        //3: cek
        System.out.println("Total tarif = "+totalTarif+ " rupiah");
        if (pengecekan) {
            System.out.println("Penggunaan listrik anda melebihi 500 kwh");
        }
        else {
            System.out.println("Penggunaan listrik anda tidak melebihi 500 kwh");
        }
        input.close();
    }
    
}

