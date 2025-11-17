package db.service;

import db.connection.HibernateUtil;
import db.dao.DoctorDAO;
import db.dao.GenericDAO;
import db.dao.PacienteDAO;
import db.model.Doctor;
import db.model.Paciente;
import org.hibernate.Session;

import java.util.List;

public class PacienteService extends GenericServiceImpl<Paciente, Integer> {
    public PacienteService() {super(new PacienteDAO());}

    public List<Doctor> getDoctoresPorPaciente(int pacienteID){
        PacienteDAO pacienteDAO = (PacienteDAO) getDao();
        return pacienteDAO.getDoctoresPorPaciente(pacienteID);
    }
}
