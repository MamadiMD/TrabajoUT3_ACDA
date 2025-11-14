package db.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class AtiendeID {
    private int pacienteID;
    private int doctorID;
}
