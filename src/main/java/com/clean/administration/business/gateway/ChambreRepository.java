package com.clean.administration.business.gateway;

import com.clean.administration.business.entity.Chambre;

import java.util.List;

public interface ChambreRepository {

    List<Chambre> recupererChambres();
    void sauvegarderLesChambres(List<Chambre> chambres);
}
