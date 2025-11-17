package db.dao;

import db.model.Paciente;

public class PacienteDAO extends GenericDAOImpl<Paciente, Integer>{
    public PacienteDAO() {
        super(Paciente.class);
    }
}
