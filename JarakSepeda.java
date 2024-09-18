import java.util.Scanner;
public class JarakSepeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kec = 2, jarak;
        double waktu;
        System.out.print("Masukkan jarak dalam bentuk KM =");
        jarak = sc.nextInt();

        waktu = (double) jarak/kec;
        System.out.println("Waktu yang dibutuhkan adalah="+ waktu + " jam");


    }
    
}
