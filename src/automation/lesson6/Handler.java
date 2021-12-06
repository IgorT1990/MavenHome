package automation.lesson6;

public class Handler {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.info("Some info");
        logger.debug("Some text");
        logger.error("Some text about errors");
        logger.warning("Some warnings");

    }

}
