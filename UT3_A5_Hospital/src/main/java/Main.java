
import db.model.*;
import db.service.*;

import db.model.HistorialMedico;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args){
        DoctorService doctorService = new DoctorService();
        PacienteService pacienteService = new PacienteService();
        AtiendeService atiendeService = new AtiendeService();
        HospitalService hospitalService = new HospitalService();
        HabitacionService habitacionService = new HabitacionService();

        HistorialMedico historialMedico = new HistorialMedico();
        historialMedico.setAlergias("Polen");
        historialMedico.setEnfermedades("Diabetes");
        historialMedico.setVacunas("Gripe");
        historialMedico.setMedicamentos("Insulina");
        System.out.println("HistorialMedico ANTES de create:\n" + historialMedico);
        HistorialMedicoService historialMedicoService = new HistorialMedicoService();
        historialMedicoService.create(historialMedico);
        System.out.println("HistorialMedico DESPUÉS de create:\n" + historialMedico);

        HistorialMedico historialMedico1 = new HistorialMedico();
        historialMedico1.setAlergias("Graminias");
        historialMedico1.setVacunas("Gripe");
        historialMedicoService.create(historialMedico1);
        HistorialMedico historialMedico2 = new HistorialMedico();
        historialMedico2.setEnfermedades("Hipertension");
        historialMedico2.setMedicamentos("Paracetamol");
        historialMedicoService.create(historialMedico2);


        Hospital hospital = new Hospital();
        hospital.setNombre("Hospital de Pamplona");
        hospital.setPais("España");
        hospital.setNumCamas(1000);

        hospitalService.create(hospital);


        List<HistorialMedico> historialMedicoList = historialMedicoService.findAll();
        System.out.println("TODOS LOS HistorialMedico PERSISTIDOS:");
        historialMedicoList.forEach(System.out::println);


        List<HistorialMedico> ListHistorialMedico = historialMedicoService.findDiabeticPeople("Diabetes");
        ListHistorialMedico.forEach(System.out::println);

        Doctor doctor = new Doctor();
        doctor.setNombre("Pedro");
        doctor.setApellido("Jiménez");
        doctor.setHospital(hospital);

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


        List<HistorialMedico> historialMedicoList1 = historialMedicoService.findDiabeticPeople("Diabetes");
        historialMedicoList1.forEach(System.out::println);

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumero(119);
        habitacion1.setDisponible(true);
        habitacion1.setHospital(hospital);
        habitacion1.setPaciente(paciente1);


        System.out.println("Habitación ANTES de create:\n" + habitacion1);
        habitacionService.create(habitacion1);
        System.out.println("Habitación DESPUÉS de create:\n" + habitacion1);

        Habitacion habitacion4 = new Habitacion();
        habitacion4.setNumero(121);
        habitacion4.setDisponible(false);
        habitacion4.setHospital(hospital);
        habitacion4.setPaciente(paciente2);
        habitacionService.create(habitacion4);

        List<Habitacion> habitacionList = habitacionService.findAll();
        System.out.println("TODAS LAS HABITACIONES: ");
        habitacionList.forEach(System.out::println);

        List<Habitacion> habitacionList1 = habitacionService.findHabitacionesDisponibles();
        System.out.println("TODAS LAS HABITACIONES DISPONIBLES: ");
        habitacionList1.forEach(System.out::println);

        List<Paciente> pacientes = doctorService.getPacientesPorDoctor(doctor.getDoctorID());
        System.out.println("LISTADO DE PACIENTES POR DOCTOR");
        pacientes.forEach(System.out::println);

        List<Doctor> doctores = pacienteService.getDoctoresPorPaciente(paciente1.getPacienteID());
        System.out.println("LISTADO DE DOCTORES POR PACIENTE");
        doctores.forEach(System.out::println);


        hospitalService.obtenerDoctoresHospital(hospital.getHospitalID());
        hospitalService.obtenerHabitacionesHospital(hospital.getHospitalID());




        LicenciaProfesionalService licenciaService = new LicenciaProfesionalService();

        LicenciaProfesional lic1 = new LicenciaProfesional();
        lic1.setOrganismo("OMC");
        lic1.setFechaEmision(new Date());
        lic1.setFechaExpiracion(new Date());
        licenciaService.create(lic1);

        LicenciaProfesional lic2 = new LicenciaProfesional();
        lic2.setOrganismo("OPS");
        lic2.setFechaEmision(new Date());
        lic2.setFechaExpiracion(new Date());
        licenciaService.create(lic2);

        LicenciaProfesional lic3 = new LicenciaProfesional();
        lic3.setOrganismo("OMC");
        lic3.setFechaEmision(new Date());
        lic3.setFechaExpiracion(new Date());
        licenciaService.create(lic3);

        System.out.println("\n--- TODAS LAS LICENCIAS PROFESIONALES ---");
        licenciaService.findAll().forEach(System.out::println);

        System.out.println("\n--- LICENCIAS EMITIDAS POR LA OMC ---");
        licenciaService.findOrganismoOMS().forEach(System.out::println);


    }
}
