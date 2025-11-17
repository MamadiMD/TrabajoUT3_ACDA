package db.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorID;

    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    private List<Atiende> atiende = new ArrayList<>();

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
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
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", atiende=" + atiende +
                '}';
    }
}
