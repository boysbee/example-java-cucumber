package example.fizzbuzz;

/**
 * Created by nchatmalairut on 4/21/2016.
 */
public class FizzBuzz {
    public String getResult(int playedNumber) {
        if (playedNumber % 3 == 0 && playedNumber % 5 == 0) {
            return "fizzbuzz";
        } else {

            if (playedNumber % 3 == 0) {
                return "fizz";
            }
            if (playedNumber % 5 == 0) {
                return "buzz";
            }
        }
        return Integer.toString(playedNumber);
    }
}
