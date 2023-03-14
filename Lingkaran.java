import java.util.Scanner;

public class Lingkaran {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double jari, luas, keliling;
      
      System.out.print("Masukkan jari-jari lingkaran: ");
      jari = input.nextDouble();
      
      // Menghitung luas lingkaran
      luas = Math.PI * jari * jari;
      System.out.println("Luas lingkaran: " + luas);
      
      // Menghitung keliling lingkaran
      keliling = 2 * Math.PI * jari;
      System.out.println("Keliling lingkaran: " + keliling);
   }
}

