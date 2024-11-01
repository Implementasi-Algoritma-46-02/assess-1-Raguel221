
import java.util.Scanner;
public class Soal04 {

}
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

        final double HONOR_PER_JAM = 30000;
        double tunjangan = 0;

        String input = scanner.nextLine().trim();
        String [] parts = input.split(" ");
        String kodePosisi = parts[0];
        int jamKerja = Integer.parseInt(parts[1]);

        switch (kodePosisi) {
            case "DES":
                tunjangan = 600000;
                break;
            case "PRG":
                tunjangan = 1200000;
                break;
            case "WRT":
                tunjangan = 400000;
                break;
            case "MKT":
                tunjangan = 500000;
                break;
            default:
                System.out.println("Kode posisi tidak valid.");
                scanner.close();
                return; 

        double honorDasar = jamKerja * HONOR_PER_JAM + tunjangan;

        double bonus = 0;
        if (jamKerja > 175) {
            bonus = (jamKerja * HONOR_PER_JAM) * 0.07; // Bonus 7% dari honor per jam
        } else if (jamKerja > 160) {
            bonus = (jamKerja * HONOR_PER_JAM) * 0.05; // Bonus 5% dari honor per jam
        }
        double totalHonor = honorDasar + bonus;
        System.out.printf("%.1f%n", totalHonor);

        scanner.close();
	}
}
