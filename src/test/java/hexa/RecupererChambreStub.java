package hexa;

import com.hexa.core.application.Chambre;
import com.hexa.core.port.serverside.ForRecupererChambre;

import java.util.List;

public class RecupererChambreStub implements ForRecupererChambre {
    private List<Chambre> chambres;

    public RecupererChambreStub(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    @Override
    public List<Chambre> recupererChambres() {
        return this.chambres;
    }
}
