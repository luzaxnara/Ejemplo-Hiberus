package PruebaHerokuHiberus.ejemplohiberus.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarController {

    @GetMapping("/saludar")
    public String saludar() {
        return "hola mundo";

    }

}
