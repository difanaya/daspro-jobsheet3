import java.util.Scanner;
public class Bensin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uang, harga = 9000;
        double bensin;

        System.out.print("Masukkan total uang = ");
        uang = input.nextInt();

        bensin =  uang/harga;

        System.out.println("Jumlah liter yang didapat = "+ bensin + " liter");
        input.close();

    }
    
}
