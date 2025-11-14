package db.service;

import db.dao.HabitacionDAO;
import db.model.Habitacion;

public class HabitacionService extends GenericServiceImpl<Habitacion, Integer> {

    public HabitacionService() {
        super(new HabitacionDAO());
    }

}