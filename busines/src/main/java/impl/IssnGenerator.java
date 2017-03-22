package impl;

import api.NumberGenerator;
import com.google.inject.Inject;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by KBolelyy on 20.03.2017.
 */



public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN : " + issn);
        return issn;
    }
}