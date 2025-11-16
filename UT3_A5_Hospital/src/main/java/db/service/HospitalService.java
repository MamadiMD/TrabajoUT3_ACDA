package db.service;

import db.dao.GenericDAO;
import db.dao.HospitalDAO;
import db.model.Hospital;

public class HospitalService extends GenericServiceImpl<Hospital,Integer>{
    public HospitalService() {
        super(new HospitalDAO());
    }

    public  Hospital findByIdWithHabitaciones(int hospitalID){
        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
        return hospitalDAO.findByIdWithHabitaciones(hospitalID);
    }

//    public  Hospital findByIdWithDoctores(int hospitalID){
//        HospitalDAO hospitalDAO = (HospitalDAO) getDao();
//        return hospitalDAO.findByIdWithDoctores(hospitalID);
//    }

}
