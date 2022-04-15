package ma.miaad.compteservice.entities;

import ma.miaad.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Compte.class)
public interface CompteProj1 {
    public Long getCode();
    public double getSolde();

}





