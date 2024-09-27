import java.util.Scanner;
public class Usia26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        byte usia;

        System.out.print("Masukkan usia: ");
        usia = sc.nextByte();

        if (usia >=0 && usia <= 12) {
            System.out.println("Anak-anak");
            
        } else if (usia > 13 && usia <= 19) {
            System.out.println("Remaja");

        } else if (usia > 19 && usia <= 64) {
            System.out.println("Dewasa");
        } else if (usia > 64) {
            System.out.println("Lansia");
        } else 
         System.out.println("Usia tidak valid");

        sc.close(); 
    }
}
