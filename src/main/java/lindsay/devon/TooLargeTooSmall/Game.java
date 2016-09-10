package lindsay.devon.TooLargeTooSmall;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class Game {
    int numberTries = 0;
    int lastGuess;
    int secretNumber;
    int userGuess;
    boolean win;

    public Game(){
        win = false;
        lastGuess = 0;
        userGuess = 0;
    }

    public void play () {
        SecretNumber secretNum = new SecretNumber();
        secretNumber = secretNum.mySecret();

        UserNumber userNumber = new UserNumber();

        while (win == false) {
            userGuess = userNumber.userGuess();
            if (userGuess != lastGuess) {
                 numberTries++;
                lastGuess = userGuess;
                checkCondition(userGuess);
            }
            else {
                System.out.println("You already tried that number. Pick another.");
            }
        }

        System.out.println("The correct number was " + secretNumber);
        System.out.println("You tried " + numberTries + " times!");

    }

    public void checkCondition(int userGuess) {
        if (userGuess == secretNumber) {
            win = true;
            System.out.println("Congrats! You got the right number!");
        } else if (userGuess > secretNumber) {
            System.out.println("Sorry, you guessed too high! Try again!");

        } else if (userGuess < secretNumber) {
            System.out.println("Sorry, you guessed too low! Try again!");
        }
    }
}
