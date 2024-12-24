import java.util.Scanner;
class LuckyLetter {
    public static void main(String[] args) {
        // Create a scanner object to read the input
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String S = sc.nextLine();
        
        // The lucky letter is at index 6 (7th character)
        char luckyLetter = S.charAt(6);
        
        // Output the lucky letter
        System.out.println(luckyLetter);
        
        // Close the scanner
        sc.close();
    }
}
