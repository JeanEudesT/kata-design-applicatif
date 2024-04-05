package com.hexa.core.port.serverside;

import com.hexa.core.application.Chambre;

import java.util.List;

public interface ForSauvegarderChambre {
    void sauvegarderLesChambres(List<Chambre> chambres);
}
