import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
        double masaStudi = scanner.nextDouble();
        double ipk = scanner.nextDouble();
        int eprt = scanner.nextInt();
        String hki = scanner.next();
        String lomba = scanner.next();
        boolean tepatWaktu = masaStudi == 3.0;
        boolean ipkMemenuhi = ipk > 3.5;
        boolean eprtMemenuhi = eprt >= 450;
        boolean hkiMemenuhi = hki.equalsIgnoreCase("ada");
        boolean lombaMemenuhi = lomba.equalsIgnoreCase("ada");
        if (tepatWaktu && ipkMemenuhi && eprtMemenuhi && (hkiMemenuhi || lombaMemenuhi)) {
            System.out.println("Cumlaude");
        } else {
            System.out.println("Sangat Memuaskan");
        }

        scanner.close();
	}
}
