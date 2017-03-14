package impl;

import api.NumberGenerator;
import com.google.inject.Inject;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by KBolelyy on 14.03.2017.
 */
public class IsbnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
   /* @Loggable*/
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN : " + isbn);
        return isbn;
    }
}
