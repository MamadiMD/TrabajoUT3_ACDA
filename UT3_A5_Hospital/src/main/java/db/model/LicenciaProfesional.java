package db.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LicenciaProfesional")
public class LicenciaProfesional {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licenciaID;
    @Column (name = "fechaEmision", nullable = true)
    private Date fechaEmision;
    @Column (name = "fechaExpiracion", nullable = true)
    private Date fechaExpiracion;
    @Column(name = "organismo", nullable = false)
    private String organismo;

    public LicenciaProfesional(int licenciaID, Date fechaEmision,Date fechaExpiracion, String organismo) {
        this.licenciaID = licenciaID;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion=fechaExpiracion;
        this.organismo=organismo;
    }

    public int getLicenciaID() {
        return licenciaID;
    }

    public void setLicenciaID(int licenciaID) {
        this.licenciaID = licenciaID;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date enVigencia) {
        this.fechaEmision = enVigencia;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getOrganismo() {
        return organismo;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }
    public LicenciaProfesional() {}


    @Override
    public String toString() {
        return "LicenciaProfesional{" +
                "licenciaID=" + licenciaID +
                ", fechaEmision=" + fechaEmision +
                ", fechaExpiracion=" + fechaExpiracion +
                ", organismo='" + organismo + '\'' +
                '}';
    }
}
