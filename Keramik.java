import java.util.Scanner;
public class Keramik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisiLantai, sisiKeramik, luasLantai, luasKeramik;
        double banyakKeramik;

        System.out.print("Masukkan panjang sisi keramik = ");
        sisiKeramik = sc.nextInt();
        System.out.print("Masukkan panjang sisi lantai = ");
        sisiLantai = sc.nextInt();

        luasKeramik = sisiKeramik*sisiKeramik;
        luasLantai = sisiLantai*sisiLantai;

        banyakKeramik = luasLantai/luasKeramik;
        System.out.println("Banyak keramik yang dibutuhkan = "+banyakKeramik+ " buah");

    }
    
}
