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

        //3: cek
        System.out.println("Lebih dari 500 kwh? "+(totalPenggunaanListrik>500));
        System.out.println("Total tarif = "+totalTarif);
        input.close();
    }
    
}

