import db.model.HistorialMedico;
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

        List<HistorialMedico> historialMedicoList = historialMedicoService.findAll();
        System.out.println("TODOS LOS HistorialMedico PERSISTIDOS:");
        historialMedicoList.forEach(System.out::println);

        List<HistorialMedico> historialMedico1 = historialMedicoService.findDiabeticPeople("Diabetes");
        historialMedico1.forEach(System.out::println);
    }
}
