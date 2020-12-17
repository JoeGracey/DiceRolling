import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initialize size of dice
        Random randomObject = new Random();
        int[] dice = new int[21];

        // Roll dice and save each roll
        for (int count = 0; count < dice.length; count++) {
            ++dice[1 + randomObject.nextInt(20)];
        }

        // Print a table with number and times rolled
        System.out.println("Number\tTimes Rolled");
        // Print the number and how many times it was rolled
    }
}
