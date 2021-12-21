package automation.lesson6;

class Logger extends Color  {
    public enum Level {
        INFO,
        DEBUG,
        WARNING,
        ERROR,
    }
    public void info(String message) {
        print(GREEN, Level.INFO, message);
    }
    public void debug(String message) {
        print(BLUE, Level.DEBUG, message);
    }
    public void error(String message) {
        print(YELLOW, Level.WARNING, message);
    }
    public void warning(String message) {
        print(RED, Level.ERROR, message);
    }

    public void print(String color, Level level, String message) {
        System.out.println(color + level + ": " + message);
    }
}
