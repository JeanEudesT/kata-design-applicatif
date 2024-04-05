package couche;

import com.couche.dao.ChambreDAO;
import com.couche.entity.Chambre;

import java.util.List;

public class ChambreDAOStub implements ChambreDAO {
    @Override
    public List<Chambre> recupererLaListeDesChambres() {
        return List.of(
                new Chambre(0, 1, 50),
                new Chambre(0, 1, 50),
                new Chambre(1, 101, 50),
                new Chambre(1, 102, 50),
                new Chambre(1, 103, 50),
                new Chambre(2, 201, 50),
                new Chambre(2, 202, 50),
                new Chambre(3, 301, 50)
        );
    }
}
