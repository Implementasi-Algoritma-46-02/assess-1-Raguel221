import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();
        int totalMenit = M + V;
        int totalJam = H + totalMenit / 60;
        totalMenit = totalMenit % 60; 
        String jamFormat = String.format("%02d", totalJam % 24); 
        String menitFormat = String.format("%02d", totalMenit);
        System.out.println(jamFormat + ":" + menitFormat);

        scanner.close();
	}
}