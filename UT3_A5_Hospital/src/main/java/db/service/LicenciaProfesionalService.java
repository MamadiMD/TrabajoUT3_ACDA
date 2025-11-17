package db.service;

import db.dao.LicenciaProfesionalDAO;
import db.model.LicenciaProfesional;

import java.util.List;

public class LicenciaProfesionalService extends GenericServiceImpl<LicenciaProfesional,Integer> {
    public LicenciaProfesionalService(){
        super(new LicenciaProfesionalDAO());
    }
    public List<LicenciaProfesional> findOrganismoOMS() {
        LicenciaProfesionalDAO dao = (LicenciaProfesionalDAO) getDao();
        return dao.findOrganismoOMC();
    }
}
