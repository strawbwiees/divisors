import java.util.*;

public class Divisors2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Loop through all numbers from 1 to N
        System.out.print("Common divisors with 2025: ");
        for (int i = 1; i <= N; i++) {
                       if (N % i == 0 && 2025 % i == 0) { 
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

