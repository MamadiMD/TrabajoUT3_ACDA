package db.service;

import db.dao.ConcretaDAO;

public class ConcretaService  extends GenericServiceImpl<Concreta, ConcretaID> {

    public ConcretaService() {
        super(new ConcretaDAO());
    }
}
