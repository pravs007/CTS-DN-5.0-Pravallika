class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("Logging service is active");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("Activity: " + message);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger firstLogger = Logger.getInstance();
        firstLogger.log("Student record created");

        Logger secondLogger = Logger.getInstance();
        secondLogger.log("Student record updated");

        System.out.println();

        if (firstLogger == secondLogger) {
            System.out.println("Single Logger instance is shared.");
        } else {
            System.out.println("Different Logger instances exist.");
        }
    }
}