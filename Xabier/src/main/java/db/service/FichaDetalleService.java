package db.service;

import db.dao.FichaDetalleDAO;


public class FichaDetalleService  extends GenericServiceImpl<FichaDetalle, Integer>{

    public FichaDetalleService() {
        super(new FichaDetalleDAO());
    }

    private final FichaDetalleDAO fichaDetalleDAO = new FichaDetalleDAO();


    public void addFichaDetalle(FichaDetalle f) {
        try {
            fichaDetalleDAO.save(f);
            System.out.println("Detalle agregado: " + f.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
