import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;

//класс логирования производимых вычислений
//при возникновении ошибки выдает сообщение с ошибкой
public class LoggerCalc {
    static void myLog(String res) {
        Logger logger = Logger.getLogger(Presenter.class.getName());
        try {
                FileHandler fh = new FileHandler("log_calc.txt", true);
                logger.addHandler(fh);
                SimpleFormatter sFormat = new SimpleFormatter();
                fh.setFormatter(sFormat);
                logger.info(res);
                fh.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
