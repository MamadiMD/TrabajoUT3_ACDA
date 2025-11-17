import db.model.Atiende;
import db.model.Doctor;
import db.model.HistorialMedico;
import db.model.Paciente;
import db.service.AtiendeService;
import db.service.DoctorService;
import db.service.HistorialMedicoService;
import db.service.PacienteService;

import java.util.List;

public class Main {

    public static void main(String[] args){
        DoctorService doctorService = new DoctorService();
        PacienteService pacienteService = new PacienteService();
        AtiendeService atiendeService = new AtiendeService();

        HistorialMedico historialMedico = new HistorialMedico();
        historialMedico.setAlergias("Polen");
        historialMedico.setEnfermedades("Diabetes");
        historialMedico.setVacunas("Gripe");
        historialMedico.setMedicamentos("Insulina");
        System.out.println("HistorialMedico ANTES de create:\n" + historialMedico);
        HistorialMedicoService historialMedicoService = new HistorialMedicoService();
        historialMedicoService.create(historialMedico);
        System.out.println("HistorialMedico DESPUÉS de create:\n" + historialMedico);

        List<HistorialMedico> historialMedicoList = historialMedicoService.findAll();
        System.out.println("TODOS LOS HistorialMedico PERSISTIDOS:");
        historialMedicoList.forEach(System.out::println);

        List<HistorialMedico> historialMedico1 = historialMedicoService.findDiabeticPeople("Diabetes");
        historialMedico1.forEach(System.out::println);

        Doctor doctor = new Doctor();
        doctor.setNombre("Pedro");
        doctor.setApellido("Jiménez");

        doctorService.create(doctor);

        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Mikel");
        paciente1.setApellido("José");

        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Abel");
        paciente2.setApellido("Martínez");

        pacienteService.create(paciente1);
        pacienteService.create(paciente2);


        Atiende atiende1 = new Atiende(paciente1, doctor);
        Atiende atiende2 = new Atiende(paciente2, doctor);

        doctor.getAtiende().add(atiende1);
        doctor.getAtiende().add(atiende2);

        doctorService.update(doctor);


    }
}
