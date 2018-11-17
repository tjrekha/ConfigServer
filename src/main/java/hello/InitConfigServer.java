package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class InitConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(InitConfigServer.class, args);
    }
}