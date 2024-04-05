package hexa;

import com.hexa.core.application.Chambre;
import com.hexa.core.port.serverside.ForRecupererChambre;
import com.hexa.core.port.serverside.ForSauvegarderChambre;
import com.hexa.core.port.userside.ForFixerPrixDesChambres;
import com.hexa.core.application.FixerPrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class administration_hotel_test_hexa {

    @Test
    public void fixer_le_prix_de_la_chambre_du_rdc() {
        // GIVEN
        double prixRDC = 100;
        ForRecupererChambre recupererChambreStub = new RecupererChambreStub(List.of(new Chambre(0, 100, 50)));
        ForSauvegarderChambre sauvegarderChambreSpy = new SauvegarderChambresSpy();
        ForFixerPrixDesChambres fixerPrix = new FixerPrix(recupererChambreStub, sauvegarderChambreSpy);
        // WHEN
        fixerPrix.fixerLePrixDesChambres(prixRDC);

        // THEN
        Assertions.assertEquals(new Chambre(0, 100, 100).toString(), ((SauvegarderChambresSpy) sauvegarderChambreSpy).getChambres().get(0).toString());
    }

    @Test
    public void fixer_le_prix_de_la_chambre_du_1er_etage() {
        // GIVEN
        double prixRDC = 100;
        ForRecupererChambre recupererChambreStub = new RecupererChambreStub(List.of(new Chambre(1, 100, 50)));
        ForSauvegarderChambre sauvegarderChambreSpy = new SauvegarderChambresSpy();
        ForFixerPrixDesChambres fixerPrix = new FixerPrix(recupererChambreStub, sauvegarderChambreSpy);
        // WHEN
        fixerPrix.fixerLePrixDesChambres(prixRDC);

        // THEN
        Assertions.assertEquals(new Chambre(1, 100, 107).toString(), ((SauvegarderChambresSpy) sauvegarderChambreSpy).getChambres().get(0).toString());

    }

    @Test
    public void fixer_le_prix_de_la_chambre_du_2eme_etage() {
        // GIVEN
        double prixRDC = 100;
        ForRecupererChambre recupererChambreStub = new RecupererChambreStub(List.of(new Chambre(2, 200, 50)));
        ForSauvegarderChambre sauvegarderChambreSpy = new SauvegarderChambresSpy();
        ForFixerPrixDesChambres fixerPrix = new FixerPrix(recupererChambreStub, sauvegarderChambreSpy);
        // WHEN
        fixerPrix.fixerLePrixDesChambres(prixRDC);

        // THEN
        Assertions.assertEquals(new Chambre(2, 200, 122).toString(), ((SauvegarderChambresSpy) sauvegarderChambreSpy).getChambres().get(0).toString());

    }

    @Test
    public void fixer_le_prix_de_la_chambre_du_3eme_etage() {
        // GIVEN
        double prixRDC = 100;
        ForRecupererChambre recupererChambreStub = new RecupererChambreStub(List.of(new Chambre(3, 300,50)));
        ForSauvegarderChambre sauvegarderChambreSpy = new SauvegarderChambresSpy();
        ForFixerPrixDesChambres fixerPrix = new FixerPrix(recupererChambreStub, sauvegarderChambreSpy);
        // WHEN
        fixerPrix.fixerLePrixDesChambres(prixRDC);

        // THEN
        Assertions.assertEquals(new Chambre(3, 300, 133).toString(), ((SauvegarderChambresSpy) sauvegarderChambreSpy).getChambres().get(0).toString());
    }
}
