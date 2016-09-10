package lindsay.devon.TooLargeTooSmall;
import java.util.Scanner;
/**
 * Created by devonlindsay on 9/10/16.
 */
public class UserNumber {

    public int userGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number, any number...(as long as it is positive, whole and less than 10)");
        return scanner.nextInt();
     }

}
