package PruebaHerokuHiberus.ejemplohiberus.controllers;
import PruebaHerokuHiberus.ejemplohiberus.entities.Persona;
import PruebaHerokuHiberus.ejemplohiberus.repositories.PersonaRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarController {

    @GetMapping("/saludar")
    public String saludar() {
        return "hola mundo";

    }
    
    @Autowired
    private PersonaRepository repo;
    
    @GetMapping("/add")
    
    public List <Persona> add(){
        
        Persona p= new Persona();
        p.setNombre(UUID.randomUUID().toString());
        
       repo.save(p);
       return repo.findAll();
    }

}