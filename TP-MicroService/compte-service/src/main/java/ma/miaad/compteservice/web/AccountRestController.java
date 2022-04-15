package ma.miaad.compteservice.web;

import ma.miaad.compteservice.dtos.VirementRequestDTO;
import ma.miaad.compteservice.service.CompteServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteServise compteServise;
    @PutMapping(path = "comptes/virement")
    public void virement(@RequestBody VirementRequestDTO request){
        compteServise.virement(request.getCodeSource(),request.getCodeDistination(),request.getMoantant());
    }
}
