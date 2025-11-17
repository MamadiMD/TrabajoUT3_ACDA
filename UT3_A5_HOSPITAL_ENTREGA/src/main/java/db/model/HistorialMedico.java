package db.model;

import jakarta.persistence.*;

@Entity
@Table(name = "HistorialMedico")
public class HistorialMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int historialMedicoID;

    @Column(name = "alergias", nullable = true, length = 500, unique = false)
    private String alergias;

    @Column(name = "medicamentos", nullable = true, length = 1000, unique = false)
    private String medicamentos;

    @Column(name = "enfermedades", nullable = true, length = 1000, unique = false)
    private String enfermedades;

    @Column(name = "vacunas", nullable = true, length = 1000, unique = false)
    private String vacunas;

    public int getHistorialMedicoID() {
        return historialMedicoID;
    }

    public void setHistorialMedicoID(int historialMedicoID) {
        this.historialMedicoID = historialMedicoID;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "historialMedicoID=" + historialMedicoID +
                ", alergias='" + alergias + '\'' +
                ", medicamentos='" + medicamentos + '\'' +
                ", enfermedades='" + enfermedades + '\'' +
                ", vacunas='" + vacunas + '\'' +
                '}';
    }
}
