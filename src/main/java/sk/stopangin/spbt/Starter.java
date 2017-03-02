package sk.stopangin.spbt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class Starter {

        private static Log logger = LogFactory.getLog(Starter.class);

        public static void main(String[] args) throws Exception {
            SpringApplication.run(Starter.class, args);
        }
}
