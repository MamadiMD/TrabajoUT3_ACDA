package db.service;


import db.connection.HibernateUtil;
import db.dao.DoctorDAO;
import db.dao.HospitalDAO;
import db.model.Doctor;
import db.model.Paciente;
import org.hibernate.Session;

import java.util.List;

public class DoctorService extends GenericServiceImpl<Doctor, Integer>{
    public DoctorService() { super(new DoctorDAO());}

    public List<Paciente> getPacientesPorDoctor(int doctorID){
        DoctorDAO doctorDAO = (DoctorDAO) getDao();
        return doctorDAO.getPacientesPorDoctor(doctorID);
    }

}
