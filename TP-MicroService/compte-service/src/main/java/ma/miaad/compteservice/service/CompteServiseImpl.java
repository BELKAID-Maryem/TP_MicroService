package ma.miaad.compteservice.service;

import ma.miaad.compteservice.entities.Compte;
import ma.miaad.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompteServiseImpl implements CompteServise {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public void virement(Long codeSource, Long codeDestination, double mantant) {
        Compte c1=compteRepository.getById(codeSource);
        Compte c2=compteRepository.getById(codeDestination);
        c1.setSolde(c1.getSolde()-mantant);
        c2.setSolde(c2.getSolde()+mantant);
        compteRepository.save(c1);
        compteRepository.save(c2);
    }
}
