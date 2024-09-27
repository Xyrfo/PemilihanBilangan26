import java.util.Scanner;
public class Siakad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas; 
        byte absen; 
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir; 

        System.out.print("Masukkan nama: "); 
        nama = sc.nextLine(); 
        System.out.print("Masukkan NIM: "); 
        nim = sc.nextLine(); 
        System.out.print("Masukkan kelas: "); 
        kelas = sc.nextLine().charAt(0); 
        System.out.print("Masukkan nomor absen: "); 
        absen = sc.nextByte(); 
        System.out.print("Masukkan nilai kuis: "); 
        nilaiKuis = sc.nextDouble(); 
        System.out.print("Masukkan nilai tugas: "); 
        nilaiTugas = sc.nextDouble(); 
        System.out.print("Masukkan nilai ujian: "); 
        nilaiUjian = sc.nextDouble(); 
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3; 
        String huruf="huruf", Kategori="Kategori";
    if (nilaiAkhir>80 && nilaiAkhir<=100) {
        huruf = "A";
        Kategori = "Sangat Baik";
    }
     else if (nilaiAkhir>73 && nilaiAkhir<=80) {
        huruf = "B+";
        Kategori = "Lebih dari Baik";
    } 
    else if (nilaiAkhir>65 && nilaiAkhir<=73) {
        huruf = "B";
        Kategori = "Baik";
    }
     else if (nilaiAkhir>60 && nilaiAkhir<=65) {
        huruf = "C+";
        Kategori = "Lebih dari Cukup";
    } 
    else if (nilaiAkhir>50 && nilaiAkhir<=60) {
        huruf = "C";
        Kategori = "Cukup";
    }
     else if (nilaiAkhir>39 && nilaiAkhir<=50) {
        huruf = "D";
        Kategori = "Kurang";  
     }
     else if (nilaiAkhir<=39) {
        huruf = "E";
        Kategori = "Gagal";
     } else 
     System.out.println("Nilai yang anda masukkan salah");
        System.out.println("Nama: " + nama + " NIM: " + nim); 
        System.out.println("Kelas: " + kelas + " Absen: " + absen); 
        System.out.println("Nilai Akhir: " + nilaiAkhir); 
        System.out.println("nilai akhir huruf: " + huruf);
        System.out.println("Kategori " + Kategori);
    }
}
