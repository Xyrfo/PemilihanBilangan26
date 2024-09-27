    import java.util.Scanner;
public class Modifikasi1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0 ) ? " genap" : " ganjil";
        System.out.println(angka + " termasuk bilangan" + hasil );
    }
}