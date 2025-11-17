package db.service;

import db.dao.GenericDAO;
import db.dao.HospitalDAO;
import db.model.Doctor;
import db.model.Habitacion;
import db.model.Hospital;

import java.math.BigDecimal;
import java.util.List;

public class HospitalService extends GenericServiceImpl<Hospital,Integer>{
    public HospitalService() {
        super(new HospitalDAO());
    }

//    public  Hospital findByIdWithHabitaciones(int hospitalID){
//        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
//        return hospitalDAO.findByIdWithHabitaciones(hospitalID);
//    }
//
//    public  Hospital findByIdWithDoctores(int hospitalID){
//        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
//        return hospitalDAO.findByIdWithDoctores(hospitalID);
//    }

    public List<Habitacion> obtenerHabitacionesHospital(int hospitalID){
        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
        return hospitalDAO.getHabitacionesPorHospital(hospitalID);
    }

    public List<Doctor> obtenerDoctoresHospital(int hospitalID){
        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
        return hospitalDAO.getDoctoresPorHospital(hospitalID);
    }

}
