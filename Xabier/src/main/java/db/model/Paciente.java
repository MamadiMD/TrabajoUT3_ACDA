package db.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacienteID;

    private String nombre;
    private String apellido;

}
