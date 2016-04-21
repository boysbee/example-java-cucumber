package example.cucumber;

/**
 * Created by boysbee on 4/21/2016.
 */
public class Echo {
    private String message;


    public void say(String name) {
        message = "hello " + name;
    }

    public String echo() {
        return this.message;
    }
}
