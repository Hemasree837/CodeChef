import java.util.Scanner;

public class IncreaseIQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int chefIQ = X + 7;
        int einsteinIQ = 170;
        if (chefIQ > einsteinIQ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
