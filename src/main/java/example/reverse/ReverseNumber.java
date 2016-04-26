package example.reverse;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by nchatmalairut on 4/26/2016.
 */
public class ReverseNumber {
    public String reverse(final int number) {
        return convert(Integer.toString(number), Integer.toString(number).length());
    }


    private static String convert(final String str, final int len) {
        return len == 0 ? "" : Character.toString(str.charAt(len - 1)) + convert(str, len - 1);
    }
}
