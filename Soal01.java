import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String id = scanner.nextLine().trim();
            if (isValidID(id)) {
                System.out.println(id + " - Valid");
            } else {
                System.out.println(id + " - Tidak Valid");
            }
        }
        scanner.close();
    }
    private static boolean isValidID(String id) {
        // Cek apakah id terdiri dari 3 digit dan semua karakter adalah angka
        if (id.length() != 3 || !id.matches("\\d{3}")) {
            return false;
        }
        int digit1 = Character.getNumericValue(id.charAt(0));
        int digit2 = Character.getNumericValue(id.charAt(1));
        int digit3 = Character.getNumericValue(id.charAt(2));
        if (digit1 > digit2 || digit2 > digit3) {
            return false;
        }
        if (digit3 % 2 == 0) {
            return false;
        }
        return digit1 != digit2 && digit2 != digit3 && digit1 !=digit3;
    }
}
