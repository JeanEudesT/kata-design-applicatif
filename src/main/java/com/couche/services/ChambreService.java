package com.couche.services;

import com.couche.entity.Chambre;
import com.couche.dao.ChambreDAO;

import java.util.List;

public class ChambreService {

    public ChambreDAO chambreDAO;
    public ChambreService(ChambreDAO chambreDAO) {
        this.chambreDAO = chambreDAO;
    }

    public List<Chambre> recupererChambres() {
        return this.chambreDAO.recupererLaListeDesChambres();
    }
}
