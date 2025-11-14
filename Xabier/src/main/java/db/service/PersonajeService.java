package db.service;

import db.dao.GenericDAO;
import db.dao.PersonajeDAO;
import db.model.Personaje;

public class PersonajeService extends GenericServiceImpl<Personaje, Integer>{

    public PersonajeService() {
        super(new PersonajeDAO());
    }

    private final PersonajeDAO personajeDAO = new PersonajeDAO();

    public void addPersonaje(Personaje p) {
        try {
            personajeDAO.save(p);
            System.out.println("Personaje agregado: " + p.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
