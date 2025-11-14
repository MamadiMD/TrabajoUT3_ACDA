package db.dao;

import db.model.HistorialMedico;

public class HistorialMedicoDAO extends GenericDAOImpl<HistorialMedico, Integer> {
    public HistorialMedicoDAO(){
        super(HistorialMedico.class);
    }
}
