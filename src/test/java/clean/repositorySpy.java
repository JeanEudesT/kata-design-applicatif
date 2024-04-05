package clean;

import com.clean.administration.business.entity.Chambre;
import com.clean.administration.business.gateway.ChambreRepository;

import java.util.List;

public class repositorySpy implements ChambreRepository {

    private List<Chambre> chambres;

    public repositorySpy(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    @Override
    public List<Chambre> recupererChambres() {
        return this.chambres;
    }

    @Override
    public void sauvegarderLesChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }
}
