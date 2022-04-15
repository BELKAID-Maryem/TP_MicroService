package ma.miaad.compteservice.service;

public interface CompteServise {
    public void virement(Long codeSource,Long codeDestination,double mantant);
}
