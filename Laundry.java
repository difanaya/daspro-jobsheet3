import java.util.Scanner;
public class Laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biaya = 2000, kg, totalHarga;

        System.out.print("Masukkan Kg Laundry = ");
        kg = sc.nextInt();

        totalHarga = biaya*kg;
        
        System.out.println("Total harga yang harus dibayar = "+ totalHarga);

        
    }
}
