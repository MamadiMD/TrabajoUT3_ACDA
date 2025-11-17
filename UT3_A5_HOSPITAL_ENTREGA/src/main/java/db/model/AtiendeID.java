package db.model;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class AtiendeID {
    private int pacienteID;
    private int doctorID;

    public AtiendeID(){}

    public AtiendeID(int pacienteID, int doctorID){
        this.pacienteID = pacienteID;
        this.doctorID = doctorID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtiendeID that = (AtiendeID) o;
        return pacienteID == that.pacienteID && doctorID == that.doctorID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(pacienteID, doctorID);
    }

    public int getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(int pacienteID) {
        this.pacienteID = pacienteID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
}
