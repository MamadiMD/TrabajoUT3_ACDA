package db.service;

import db.dao.LicenciaProfesionalDAO;
import db.model.LicenciaProfesional;

public class LicenciaProfesionalService extends GenericServiceImpl<LicenciaProfesional,Integer> {
    public LicenciaProfesionalService(){
        super(new LicenciaProfesionalDAO());
    }
}
