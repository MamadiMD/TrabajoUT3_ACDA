import db.model.Habitacion;
import db.model.HistorialMedico;
import db.service.HabitacionService;
import db.service.HistorialMedicoService;

import java.util.List;

public class Main {
    public static void main(String[] args){
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

        List<HistorialMedico> historialMedicoList = historialMedicoService.findAll();
        System.out.println("TODOS LOS HistorialMedico PERSISTIDOS:");
        historialMedicoList.forEach(System.out::println);

        List<HistorialMedico> historialMedicoList1 = historialMedicoService.findDiabeticPeople("Diabetes");
        historialMedicoList1.forEach(System.out::println);

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumero(120);
        habitacion1.setDisponible(true);

        System.out.println("Habitación ANTES de create:\n" + habitacion1);
        HabitacionService habitacionService = new HabitacionService();
        habitacionService.create(habitacion1);
        System.out.println("Habitación DESPUÉS de create:\n" + habitacion1);

        Habitacion habitacion2 = new Habitacion();
        habitacion2.setNumero(120);
        habitacion2.setDisponible(false);
        habitacionService.create(habitacion2);

        Habitacion habitacion3 = new Habitacion();
        habitacion3.setNumero(120);
        habitacion3.setDisponible(true);
        habitacionService.create(habitacion3);

        Habitacion habitacion4 = new Habitacion();
        habitacion4.setNumero(120);
        habitacion4.setDisponible(false);
        habitacionService.create(habitacion4);

        List<Habitacion> habitacionList = habitacionService.findAll();
        System.out.println("TODAS LAS HABITACIONES: ");
        habitacionList.forEach(System.out::println);

        List<Habitacion> habitacionList1 = habitacionService.findHabitacionesDisponibles();
        System.out.println("TODAS LAS HABITACIONES DISPONIBLES: ");
        habitacionList1.forEach(System.out::println);

    }
}
