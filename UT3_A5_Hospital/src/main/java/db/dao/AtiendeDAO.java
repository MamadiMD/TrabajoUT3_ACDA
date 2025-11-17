package db.dao;

import db.model.Atiende;
import db.model.AtiendeID;
import db.model.AtiendeService;

public class AtiendeDAO extends GenericDAOImpl<Atiende, AtiendeID> {
    public AtiendeDAO() {
        super(Atiende.class);
    }
}
