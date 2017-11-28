package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    private String mikaon = "käynnisty nytte";
    
    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/LithMcFluffy/aliveapplication";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/LithMcFluffy/aliveapplication";
    }

    public static String herokuUrl() {
        return "https://aliveapplication.herokuapp.com/";
    }
}
