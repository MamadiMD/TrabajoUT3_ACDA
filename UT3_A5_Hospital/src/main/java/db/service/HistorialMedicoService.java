package db.service;


import db.dao.HistorialMedicoDAO;
import db.model.HistorialMedico;

import java.util.List;

public class HistorialMedicoService extends GenericServiceImpl<HistorialMedico,Integer> {
    public HistorialMedicoService(){
        super(new HistorialMedicoDAO());
    }

    public List<HistorialMedico> findDiabeticPeople(String enfermedad) {
        HistorialMedicoDAO dao = (HistorialMedicoDAO) getDao();
        return dao.findDiabeticPeople(enfermedad);
    }

}
