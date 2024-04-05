package couche;

import com.couche.entity.Chambre;
import com.couche.services.ChambreService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class administration_hotel_test {

    @Test()
    public void lister_les_infos_dune_chambre() {
        // GIVEN
        ChambreService service = new ChambreService(new ChambreDAOStub());

        // WHEN
        List<Chambre> chambres = service.recupererChambres();

        // THEN
        Assertions.assertEquals("etage=0; numero=1; prix=50 |", chambres.get(0).toString());
    }

    @Test()
    public void lister_les_infos_de_toutes_les_chambres() {
        // GIVEN
        ChambreService service = new ChambreService(new ChambreDAOStub());

        // WHEN
        List<Chambre> chambres = service.recupererChambres();

        // THEN
        Assertions.assertEquals("[etage=0; numero=1; prix=50 |, etage=0; numero=1; prix=50 |, etage=1; numero=101; prix=50 |, etage=1; numero=102; prix=50 |, etage=1; numero=103; prix=50 |, etage=2; numero=201; prix=50 |, etage=2; numero=202; prix=50 |, etage=3; numero=301; prix=50 |]", chambres.toString());
    }
}
