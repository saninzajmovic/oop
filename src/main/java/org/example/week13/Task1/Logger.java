package org.example.week13.Task1;

class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger initialised");
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }
    public void logWarning(String message) {
        System.out.println("[WARNING] " + message);
    }
    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }
}

class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("obicni log");
        logger.logInfo("neka informacija");
        logger.logWarning("neko upozorenje");
        logger.logError("neki error");
    }
}
