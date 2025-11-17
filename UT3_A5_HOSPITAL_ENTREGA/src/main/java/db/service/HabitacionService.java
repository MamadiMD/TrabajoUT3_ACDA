package db.service;

import db.dao.HabitacionDAO;
import db.model.Habitacion;

import java.util.List;

public class HabitacionService extends GenericServiceImpl<Habitacion, Integer> {

    public HabitacionService() {
        super(new HabitacionDAO());
    }

    public List<Habitacion> findHabitacionesDisponibles() {
        HabitacionDAO dao = (HabitacionDAO) getDao();
        return dao.findHabitacionesDisponibles();
    }

}