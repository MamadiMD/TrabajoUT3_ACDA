package db.service;

import db.dao.MisionDAO;

public class MisionService  extends GenericServiceImpl<Mision, Integer>{

    public MisionService() {
        super(new MisionDAO());
    }

    private final MisionDAO misionDAO = new MisionDAO();

    public void addMision(Mision m) {
        try {
            misionDAO.save(m);
            System.out.println("Misión agregada: " + m.getTitulo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
