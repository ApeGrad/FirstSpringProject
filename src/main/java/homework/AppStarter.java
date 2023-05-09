package homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;
@SpringBootApplication
public class AppStarter {
        private static final Logger log = Logger.getLogger(AppStarter.class.getName());

        public static void main(String[] args) {
            log.info("Started my main..");
            SpringApplication.run(AppStarter.class,args);
            log.info("Finished my main..");
        }
    }
