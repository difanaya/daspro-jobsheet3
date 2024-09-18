import java.util.Scanner;

public class Tandon { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, t, v, debit, waktu;
        System.out.print("Masukkan jari-jari = ");
        r = sc.nextDouble();
        System.out.print("Masukkan tinggi tandon = ");
        t = sc.nextDouble();
        System.out.print("Masukkan kecepatan air = ");
        debit = sc.nextDouble();

        v = Math.PI*Math.pow(r,2)*t;
        waktu = v/debit;

        System.out.println("Waktu yang dibutuhkan adalah = "+ String.format("%.2f", waktu)+ " detik");




    }
    
}
