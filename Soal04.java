import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
        final double HONOR_PER_JAM = 30000;
        double tunjangan = 0;
        String kodePosisi = scanner.nextLine();
        int jamKerja = scanner.nextInt();
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
                System.out.println("Kode posisi salah.");
                scanner.close();
                return; 
        }
        double honorDasar = jamKerja * HONOR_PER_JAM + tunjangan;
        double bonus = 0;
        if (jamKerja > 175) {
            bonus = (jamKerja * HONOR_PER_JAM) * 0.07; 
        } else if (jamKerja > 160) {
            bonus = (jamKerja * HONOR_PER_JAM) * 0.05; 
        }
        double totalHonor = honorDasar + bonus;
        System.out.printf("%.1f%n", totalHonor);

        scanner.close();
	}
}
