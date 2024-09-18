import java.util.Scanner;
public class Sepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlBarang, jmlHari, rata;

        System.out.print("Masukkan jumlah barang yang terjual = ");
        jmlBarang = input.nextInt();
        System.out.print("Masukkan jumlah hari = ");
        jmlHari = input.nextInt();

        rata = jmlBarang/jmlHari;
        System.out.println("Rata-rata = "+rata+ "barang/hari");
        input.close();
    }
    
}
