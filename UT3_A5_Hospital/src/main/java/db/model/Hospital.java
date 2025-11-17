package db.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalID;

//    @OneToMany(mappedBy = "hospital" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    List<Habitacion> habitaciones = new ArrayList<>();
//
//    @OneToMany(mappedBy = "Doctor", cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
//    List<Doctor>doctores = new ArrayList<>();

    @Column(name = "Nombre", nullable = false, length = 500, unique = true)
    private String nombre;

    @Column(name = "Pais", nullable = false, length = 100, unique = false)
    private String pais;

    @Column(name = "numCamas", nullable = false)
    private int numCamas;

    public Hospital() {}

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

//    public List<Habitacion> getHabitaciones() {
//        return habitaciones;
//    }
//
//    public void setHabitaciones(List<Habitacion> habitaciones) {
//        this.habitaciones = habitaciones;
//    }
//
//    public List<Doctor> getDoctores() {
//        return doctores;
//    }
//
//    public void setDoctores(List<Doctor> doctores) {
//        this.doctores = doctores;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalID=" + hospitalID +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", numCamas=" + numCamas +
                '}';
    }
}
