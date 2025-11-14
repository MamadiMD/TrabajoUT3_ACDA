package db.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partidaID;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private LocalDate fechaInicio;

    private int numeroJugadores;
    private String estado; // en curso, finalizada, en pausa

    @OneToMany(fetch = FetchType.LAZY)
    private List<Mision> misiones;

    // Constructor
    public Partida(int partidaID, String nombre, LocalDate fechaInicio, int numeroJugadores, String estado, List<Mision> misiones) {
        this.partidaID = partidaID;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.numeroJugadores = numeroJugadores;
        this.estado = estado;
        this.misiones = misiones;
    }

    public Partida() {
        this.fechaInicio = LocalDate.now();
    }

    // Getters y Setters
    public int getPartidaID() { return partidaID; }
    public void setPartidaID(int partidaID) { this.partidaID = partidaID; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public int getNumeroJugadores() { return numeroJugadores; }
    public void setNumeroJugadores(int numeroJugadores) { this.numeroJugadores = numeroJugadores; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Mision> misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "partidaID=" + partidaID +
                ", nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", numeroJugadores=" + numeroJugadores +
                ", estado='" + estado + '\'' +
                ", mision=" + misiones +
                '}';
    }
}

