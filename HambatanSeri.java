import java.util.Scanner;
public class HambatanSeri {
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
        
        rt = r1+r2+r3;
        System.out.println("Total Hambatan = "+ rt);

        }
    
}

