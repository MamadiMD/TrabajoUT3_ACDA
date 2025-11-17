package db.dao;

import db.model.Personaje;

public class PersonajeDAO extends GenericDAOImpl<Personaje, Integer>{

    public PersonajeDAO() {
        super(Personaje.class);
    }

}
