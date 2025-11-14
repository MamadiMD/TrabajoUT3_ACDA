package db.model;

import jakarta.persistence.*;

@Entity
@Table(name = "LicenciaProfesional")
public class LicenciaProfesional {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licenciaID;
    @Column (name = "enVigencia", nullable = false)
    private boolean enVigencia;

    public LicenciaProfesional(int licenciaID, boolean enVigencia) {
        this.licenciaID = licenciaID;
        this.enVigencia = enVigencia;
    }

    public int getLicenciaID() {
        return licenciaID;
    }

    public void setLicenciaID(int licenciaID) {
        this.licenciaID = licenciaID;
    }

    public boolean isEnVigencia() {
        return enVigencia;
    }

    public void setEnVigencia(boolean enVigencia) {
        this.enVigencia = enVigencia;
    }

    @Override
    public String toString() {
        return "LicenciaProfesional{" +
                "licenciaID=" + licenciaID +
                ", enVigencia=" + enVigencia +
                '}';
    }
}
