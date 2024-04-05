package ddd;

import com.ddd.administration.business.entity.Etage;
import com.ddd.administration.business.entity.Hotel;
import com.ddd.administration.business.entity.Prix;
import com.ddd.administration.business.entity.Chambre;
import com.ddd.administration.business.gateway.HotelRepository;
import com.ddd.administration.business.rules.FixerLePrixDuneChambre;
import com.ddd.administration.business.rules.RecupererLaListeDesChambresUseCase;
import com.ddd.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;
import com.ddd.administration.business.rules.usecase.FixerLePrixDuneChambreUseCase;
import com.ddd.administration.controller.presenter.AfficherLesChambresPresenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class administration_hotel_test_ddd {
    @Test
    void fixer_le_prix_des_chambres() {
        // GIVEN
        HotelRepository repository = new repositorySpy(new Hotel(List.of(
                new Chambre(
                        new Etage(0, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        1,
                        new Prix(50)),
                new Chambre(
                        new Etage(1, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        101,
                        new Prix(53.5)),
                new Chambre(
                        new Etage(2, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        201,
                        new Prix(61)),
                new Chambre(
                        new Etage(3, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        301,
                        new Prix(66.5))
        )));
        FixerLePrixDuneChambreUseCase useCase = new FixerLePrixDuneChambre(repository);

        // WHEN
        useCase.execute(100);

        // THEN
        Assertions.assertEquals("[etage=0; numero=1; prix=100.0 |, etage=1; numero=101; prix=107.0 |, etage=2; numero=201; prix=122.0 |, etage=3; numero=301; prix=133.0 |]", ((repositorySpy) repository).getHotel().getChambres().toString());

    }

    @Test
    void afficher_la_liste_des_chambres() {
        // GIVEN
        HotelRepository repository = new repositorySpy(new Hotel(List.of(
                new Chambre(
                        new Etage(0, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        1,
                        new Prix(50)),
                new Chambre(
                        new Etage(1, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        101,
                        new Prix(53.5)),
                new Chambre(
                        new Etage(2, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        201,
                        new Prix(61)),
                new Chambre(
                        new Etage(3, Map.of(0, 1.0,1,1.07, 2, 1.22, 3, 1.33)),
                        301,
                        new Prix(66.5))
        )));
        AfficherLaListeDesChambresPresenter presenter = new AfficherLesChambresPresenter();
        RecupererLaListeDesChambresUseCase useCase = new RecupererLaListeDesChambresUseCase(presenter, repository);

        // WHEN
        useCase.execute();

        // THEN
        Assertions.assertEquals("[etage=0; numero=1; prix=50.0 |, etage=1; numero=101; prix=53.5 |, etage=2; numero=201; prix=61.0 |, etage=3; numero=301; prix=66.5 |]", ((AfficherLesChambresPresenter) presenter).getChambres().toString());
    }
}
