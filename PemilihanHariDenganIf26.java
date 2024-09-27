import java.util.Scanner;
public class PemilihanHariDenganIf26 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        byte day;
    System.out.print("Input number: ");
    day = sc.nextByte();
    if (day > 0 && day <=5) {
        System.out.println("Weekday ");
    }
    else if (day >=6 && day <=7) {
        
        System.out.println("weekend");
    }
    else {
        System.out.println("Invalid number");
    }
    }
}
