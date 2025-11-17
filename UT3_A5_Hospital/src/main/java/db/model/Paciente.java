package db.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacienteID;

    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Atiende> atiende = new ArrayList<>();


    public int getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(int pacienteID) {
        this.pacienteID = pacienteID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Atiende> getAtiende() {
        return atiende;
    }

    public void setAtiende(List<Atiende> atiende) {
        this.atiende = atiende;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "pacienteID=" + pacienteID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", atiende=" + atiende +
                '}';
    }
}
