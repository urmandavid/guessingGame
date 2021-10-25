import java.io.Console;

/**
 * Assignment 1 - Guessing Game
 */

public class Guesser {
    private int low;
    private int high;

    /*
     * Task 1. Write code here for a constructor which takes two int arguments and
     * saves them in the instance variables low and high.
     */

    // Write the constructor below this line.
    public Guesser(int low, int high) {
        this.low = low;
        this.high = high;
    }

    /*
     * Task 2. Complete the start() method, so that in the method body, you call
     * first the rules() method, next the doGuesses() method.
     */

    public void start() {
        rules();            // call the rules method here
        doGuesses();        // call the doGuesses() method here
    }

    private void rules() {
        System.out.println("Think of a number between " + low + " and " + high);
        System.out.println("I'm going to ask a few questions in order " + "to guess the number.");
        System.out.println("Please answer T for true, and F for false.\n");
    }

    /*
     * Task 3. Complete the code for the getReply() method.
     * Change the method so that it reads a reply from the player, and if
     * it is "T" or "F", we have a valid reply. Return the String that you read from
     * the player.
     */

    private String getReply() {
        String reply = System.console().readLine();                // Write code here which reads a String from the console.
        
        while( !reply.equals("T") && !reply.equals("F")) {         // As long as it is not a valid reply (one of "T" and "F")
            System.out.println("please answer T or F");
            reply = System.console().readLine();            // write an error message, and read a new reply.
        }                                            
        return reply;                                       // When you have gotten a valid reply, return it.
    }

    private void doGuesses() {
        int i = 0; // number of guesses
        int middle = 0;
        while (low < high) {
            // Set next guess to the middle between
            // current low and current high
            middle = low + (high - low) / 2;

            System.out.println("Is the number less than or equal to " + middle + "?");
            String reply = getReply();
            if ("T".equals(reply)) {
                // The number is less than or equal to middle
                // so we move down high to middle
                high = middle;
            } else {
                // The number is greater than middle,
                // so we move up low to middle + 1
                low = middle + 1;
            }
            i++; // One more guess!
        }
        // When low has met high, we don't enter the loop
        // and we have found the number
        answer(low, i);
    }

    private void answer(int guess, int numberOfGuesses) {
        System.out.println("You were thinking about " + guess + " (took me " + numberOfGuesses + " guesses)");
    }

}