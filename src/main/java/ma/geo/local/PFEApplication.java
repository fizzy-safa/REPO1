package ma.geo.local;

import org.hibernate.cfg.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(PFEApplication.class);
@Autowired
    private Environment env;
    public static void main(String[] args) {
        SpringApplication.run(PFEApplication.class);


        LOGGER.debug("start application log 1 ");
        LOGGER.warn("start application log 2 ");
        LOGGER.info("start application log 3 ");
        LOGGER.error("start application log 4 ");


    }
}
