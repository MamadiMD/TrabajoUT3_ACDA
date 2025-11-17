package db.service;

import db.dao.AtiendeDAO;
import db.model.Atiende;
import db.model.AtiendeID;

public class AtiendeService extends GenericServiceImpl<Atiende, AtiendeID> {
    public AtiendeService() {
        super(new AtiendeDAO());
    }
}
