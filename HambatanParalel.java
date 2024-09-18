import java.util.Scanner;
public class HambatanParalel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, r3;
        double rt;

        System.out.print("Masukkan nilai R1 =");
        r1 = sc.nextDouble();
        System.out.print("Masukkan nilai R2 =");
        r2 = sc.nextDouble();
        System.out.print("Masukkan nilai R3 =");
        r3 = sc.nextDouble();
        
        rt = 1/((1/r1)+(1/r2)+(1/r3));
        int rtDouble = (int)rt;
        System.out.println("Total Hambatan = "+ rtDouble);

        }
    
}
