package lindsay.devon.TooLargeTooSmall;
import java.util.Random;
/**
 * Created by devonlindsay on 9/10/16.
 */
public class SecretNumber {

    public int mySecret() {
        Random random = new Random();
        return random.nextInt(10)+1;
       }
}
