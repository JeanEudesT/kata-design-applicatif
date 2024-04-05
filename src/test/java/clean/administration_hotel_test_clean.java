package clean;

import com.clean.administration.business.entity.Chambre;
import com.clean.administration.business.rules.FixerLePrixDuneChambre;
import com.clean.administration.business.rules.RecupererLaListeDesChambresUseCase;
import com.clean.administration.business.gateway.ChambreRepository;
import com.clean.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;
import com.clean.administration.business.rules.usecase.FixerLePrixDuneChambreUseCase;
import com.clean.administration.controller.presenter.AfficherLesChambresPresenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class administration_hotel_test_clean {

    @Test
    void fixer_le_prix_des_chambres() {
        // GIVEN
        ChambreRepository repository = new repositorySpy(List.of(new Chambre(1, 101, 500)));
        FixerLePrixDuneChambreUseCase useCase = new FixerLePrixDuneChambre(repository);

        // WHEN
        useCase.execute(100);

        // THEN
        Assertions.assertEquals("[etage=1; numero=101; prix=107.0 |]", ((repositorySpy) repository).getChambres().toString());

    }

    @Test
    void afficher_la_liste_des_chambres() {
        // GIVEN
        ChambreRepository repository = new repositorySpy(List.of(new Chambre(1, 101, 50)));
        AfficherLaListeDesChambresPresenter presenter = new AfficherLesChambresPresenter();
        RecupererLaListeDesChambresUseCase useCase = new RecupererLaListeDesChambresUseCase(presenter, repository);

        // WHEN
        useCase.execute();

        // THEN
        Assertions.assertEquals("[etage=1; numero=101; prix=50.0 |]", ((AfficherLesChambresPresenter) presenter).getChambres().toString());
    }
}
