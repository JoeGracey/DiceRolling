import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initialize size of dice
        Random random = new Random();
        // 21 because its 0 - 20 with index
        int[] diceFrequency = new int[21];

        // Roll dice and save each roll
        for (int count = 0; count < 1000; count++) {
            // +1 so it's 1 - 20 instead of 0 - 19
            ++diceFrequency[1 + random.nextInt(20)];
        }

        // Print a table with number and times rolled
        System.out.println("Number\tTimes Rolled");

        // Print the index number and how many times it was rolled
        for (int count = 1; count < diceFrequency.length; count++) {
            System.out.println(count + "\t\t" + diceFrequency[count]);
        }
    }
}
