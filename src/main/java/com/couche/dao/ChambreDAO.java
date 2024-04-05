package com.couche.dao;

import com.couche.entity.Chambre;

import java.util.List;

public interface ChambreDAO {
    List<Chambre> recupererLaListeDesChambres();
}
