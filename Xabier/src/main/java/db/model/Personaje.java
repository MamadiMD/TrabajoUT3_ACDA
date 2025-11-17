package db.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personajeID;

    private String nombre;
    private String clase;
    private int nivel;
    private int puntosVida;
    private String armaPrincipal;

    @OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Concreta> concretadoEn = new ArrayList<>();


    public Personaje(int personajeID, String nombre, String clase, int nivel, int puntosVida, String armaPrincipal) {
        this.personajeID = personajeID;
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armaPrincipal = armaPrincipal;
    }

    public Personaje(){

    }

    // Getters y Setters
    public int getPersonajeID() { return personajeID; }
    public void setPersonajeID(int personajeID) { this.personajeID = personajeID; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    public String getArmaPrincipal() { return armaPrincipal; }
    public void setArmaPrincipal(String armaPrincipal) { this.armaPrincipal = armaPrincipal; }

    public List<Concreta> getConcretadoEn() {
        return concretadoEn;
    }

    public void setConcretadoEn(List<Concreta> concretadoEn) {
        this.concretadoEn = concretadoEn;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "personajeID=" + personajeID +
                ", nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                ", armaPrincipal='" + armaPrincipal + '\'' +
                '}';
    }
}
