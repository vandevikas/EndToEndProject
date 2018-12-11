import org.openqa.selenium.WebDriver;

/**
 * Singleton Class
 * with private constructor and static method to get instance of object.
 */
public class CreateDriver {

    //local variables
    private static CreateDriver instance = null;
    private String browserHandle = null;
    private static final int IMPLICIT_TIMEOUT = 0;

    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    private ThreadLocal<String> sessionID = new ThreadLocal<String>();
    private ThreadLocal<String> sessionBrowser = new ThreadLocal<String>();
    private ThreadLocal<String> sessionPlatform = new ThreadLocal<String>();
    private ThreadLocal<String> sessionVersion = new ThreadLocal<String>();

    private String getEnv = null;

    //constructor
    private CreateDriver() {

    }

    /**
     * getInstance method to retrieve active driver instance
     *
     * @return CreateDriver i.e class
     */
    public static CreateDriver getInstance() {
        if (instance == null) {
            instance = new CreateDriver();
        }
        return instance;
    }
}
