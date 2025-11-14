package db.service;

import db.dao.GenericDAO;
import db.dao.PartidaDAO;
import db.model.Partida;

public class PartidaService extends GenericServiceImpl<Partida, Integer>{

    public PartidaService() {
        super(new PartidaDAO());
    }

    private final PartidaDAO partidaDAO = new PartidaDAO();

    public void addPartida(Partida p) {
        try {
            partidaDAO.save(p);
            System.out.println("Partida agregada: " + p.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
