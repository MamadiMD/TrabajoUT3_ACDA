package db.service;


import db.dao.DoctorDAO;
import db.model.Doctor;

public class DoctorService extends GenericServiceImpl<Doctor, Integer>{
    public DoctorService() { super(new DoctorDAO());}
}
