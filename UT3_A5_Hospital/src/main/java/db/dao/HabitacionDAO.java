package db.dao;

import db.model.Habitacion;

public class HabitacionDAO extends GenericDAOImpl<Habitacion, Integer> {

    public HabitacionDAO() {
        super(Habitacion.class);
    }

}