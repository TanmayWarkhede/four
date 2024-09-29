import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddBalloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input number of balloons
        sc.nextLine(); // consume the new line character
        char[] balloons = new char[n];
        
        for (int i = 0; i < n; i++) {
            balloons[i] = sc.nextLine().charAt(0); // Input balloon colors
        }

        // Create a hashmap to store frequency of each balloon color
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count occurrences of each balloon color
        for (char balloon : balloons) {
            freqMap.put(balloon, freqMap.getOrDefault(balloon, 0) + 1);
        }
        
        // Find the first balloon with an odd frequency
        for (char balloon : balloons) {
            if (freqMap.get(balloon) % 2 != 0) {
                System.out.println(balloon);
                return;
            }
        }
        
        // If all occurrences are even, print the appropriate message
        System.out.println("All are even");
    }
}
