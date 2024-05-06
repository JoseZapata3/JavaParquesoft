package C24B5;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginJava {

    private static final Logger lg = Logger.getLogger(LogginJava.class.getName());
    //NIVELS LOG: 1. SEVERO, 2. WARNING, 3. INFO, 4. FINE


    public static void main(String[] args) {
        //lg.setLevel(Level.ALL); //SE DEFINE EL NIVEL DE LOG QUE SE VAN A GENERAR
        lg.setLevel(Level.SEVERE); // SE TIENE EN CUENTA SOLO HASTA EL NIVEL SEVERO
        ConsoleHandler consoleHandler = new ConsoleHandler();
        //consoleHandler.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.SEVERE);
        lg.addHandler(consoleHandler);

        lg.severe("Servero");
        lg.warning("warning");
        lg.info("info");
        lg.fine("fine");

    }
}
