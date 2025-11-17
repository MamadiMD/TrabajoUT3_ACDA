package db.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Atiende")
public class Atiende {

    @EmbeddedId
    private AtiendeID atiendeID = new AtiendeID();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("doctorID")
    @JoinColumn(name = "doctorID", nullable = false)
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("pacienteID")
    @JoinColumn(name = "pacienteID", nullable = false)
    private Paciente paciente;


    public Atiende() {}

    public Atiende(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public AtiendeID getAtiendeID() {
        return atiendeID;
    }

    public void setAtiendeID(AtiendeID atiendeID) {
        this.atiendeID = atiendeID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
