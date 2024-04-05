package hexa;

import com.hexa.core.application.Chambre;
import com.hexa.core.port.serverside.ForSauvegarderChambre;

import java.util.List;

public class SauvegarderChambresSpy implements ForSauvegarderChambre {

    private List<Chambre> chambres;

    @Override
    public void sauvegarderLesChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }
}
