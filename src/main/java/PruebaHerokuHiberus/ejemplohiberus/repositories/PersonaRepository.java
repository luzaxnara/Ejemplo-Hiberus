
package PruebaHerokuHiberus.ejemplohiberus.repositories;

import PruebaHerokuHiberus.ejemplohiberus.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<Persona, Integer>{
    
}
