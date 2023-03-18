public class Lingkaran {
    public static void main(String[] args) {
        double jariJari = 7.5;
        double phi = 3.14;

        // menghitung lingkaran
        double luas = phi * jariJari * jariJari;
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);

        // keliling lingkaran
        double keliling = 2 * phi * jariJari;
        System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + " adalah: " + keliling);
    }
}
