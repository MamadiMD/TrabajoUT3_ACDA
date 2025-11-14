package db.service;


import db.dao.HistorialMedicoDAO;
import db.model.HistorialMedico;

public class HistorialMedicoService extends GenericServiceImpl<HistorialMedico,Integer> {
    public HistorialMedicoService(){
        super(new HistorialMedicoDAO());
    }
}
