package db.model;

import db.dao.AtiendeDAO;
import db.service.GenericServiceImpl;

public class AtiendeService extends GenericServiceImpl<Atiende, AtiendeID> {
    public AtiendeService() {
        super(new AtiendeDAO());
    }
}
