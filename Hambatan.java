import java.util.Scanner;
public class Hambatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1,r2,r3,r4,i,rt,v;

        System.out.print("Masukkan R1: ");
        r1 = sc.nextDouble();
        System.out.print("Masukkan R2: ");
        r2 = sc.nextDouble();
        System.out.print("Masukkan R3: ");
        r3 = sc.nextDouble();
        System.out.print("Masukkan R4: ");
        r4 = sc.nextDouble();
        System.out.print("Masukkan I: ");
        i = sc.nextDouble();

        rt = 1/((1/r1)+(1/r2)+(1/r3));
        v = i*(rt + r4);
        System.out.println("Nilai V= "+v);

    }
    
}
