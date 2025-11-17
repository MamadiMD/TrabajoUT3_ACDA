package db.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int habitacionID ;

    @Column(name = "Numero", nullable = false, unique = true)
    private int numero;

    @Column(name = "Disponible", nullable = false)
    private boolean disponible;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pacienteID ", nullable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hospitalID", nullable = false)
    private Hospital hospital;

    public Habitacion() {}

    public Habitacion(int habitacionID, int numero, boolean disponible, Paciente paciente, Hospital hospital) {
        this.habitacionID = habitacionID;
        this.numero = numero;
        this.disponible = disponible;
        this.paciente = paciente;
        this.hospital = hospital;
    }

    public int getHabitacionID() {
        return habitacionID;
    }

    public void setHabitacionID(int habitacionID) {
        this.habitacionID = habitacionID;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "habitacionID=" + habitacionID +
                ", numero=" + numero +
                ", disponible=" + disponible +
                ", paciente=" + paciente +
                ", hospital=" + hospital +
                '}';
    }
}
