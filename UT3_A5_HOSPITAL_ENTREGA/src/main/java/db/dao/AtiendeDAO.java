package db.dao;

import db.model.Atiende;
import db.model.AtiendeID;

public class AtiendeDAO extends GenericDAOImpl<Atiende, AtiendeID> {
    public AtiendeDAO() {
        super(Atiende.class);
    }
}
