package esempio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WeatherAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppApplication.class, args);
    }
}

@RestController
class GreetingController {

    @GetMapping("/v1/ciao")
    public String greet(@RequestParam(name = "nome") String nome,
                        @RequestParam(name = "provincia") String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}


