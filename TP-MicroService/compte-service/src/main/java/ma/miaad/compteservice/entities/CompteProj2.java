package ma.miaad.compteservice.entities;

import ma.miaad.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
     double getSolde();
     TypeCompte getType();
    
}
