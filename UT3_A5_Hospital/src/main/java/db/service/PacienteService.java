package db.service;

import db.dao.GenericDAO;
import db.dao.PacienteDAO;
import db.model.Paciente;

public class PacienteService extends GenericServiceImpl<Paciente, Integer> {
    public PacienteService() {super(new PacienteDAO());}
}
