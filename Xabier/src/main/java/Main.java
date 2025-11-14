import db.model.*;
import db.service.FichaDetalleService;
import db.service.MisionService;
import db.service.PartidaService;
import db.service.PersonajeService;


public class Main {
    public static void main(String[] args) {
        PersonajeService personajeService = new PersonajeService();
        MisionService misionService = new MisionService();
        PartidaService partidaService = new PartidaService();
        FichaDetalleService fichaDetalleService = new FichaDetalleService();

        // 1. Crear un personaje
        Personaje p = new Personaje();
        p.setNombre("Ayla la Hechicera");
        p.setClase("Maga");
        p.setNivel(5);
        p.setPuntosVida(80);
        p.setArmaPrincipal("Bastón del Alba");

        Personaje p2 = new Personaje();
        p2.setNombre("Paquirrin");
        p2.setClase("Paco");
        p2.setNivel(50);
        p2.setPuntosVida(10);
        p2.setArmaPrincipal("Batuta");

        personajeService.addPersonaje(p);
        personajeService.addPersonaje(p2);

        // 2. Crear una misión
        Mision m = new Mision();
        m.setTitulo("El Bosque de las Sombras");
        m.setDescripcion("Explora las ruinas antiguas y vence a la Sombra del Olvido.");
        m.setDificultad("Alta");
        m.setRecompensa(500);
        m.setActiva(true);
        misionService.addMision(m);

        Mision m2 = new Mision();
        m2.setTitulo("La rumba");
        m2.setDescripcion("Explora la rumba.");
        m2.setDificultad("Baja");
        m2.setRecompensa(100);
        m2.setActiva(true);
        misionService.addMision(m2);

        // 3. Crear una partida
        Partida partida = new Partida();
        partida.setNombre("La leyenda de Ayla");
        partida.setNumeroJugadores(4);
        partida.setEstado("En curso");

        partidaService.addPartida(partida);

        m.setPartida(partida);
        m2.setPartida(partida);
        misionService.update(m);
        misionService.update(m2);

        // 4. Crear una ficha de detalle
        FichaDetalle f = new FichaDetalle();
        f.setDescripcion("Juego de hechiceros");
        f.setRaza("Humana");
        f.setAlineamiento("Vertical");
        f.setDeidad("Dios");
        f.setPersonaje(p);
        fichaDetalleService.addFichaDetalle(f);

        FichaDetalle f2 = new FichaDetalle();
        f2.setDescripcion("Paquito");
        f2.setRaza("Humano");
        f2.setAlineamiento("Vertical");
        f2.setDeidad("Dios");
        f2.setPersonaje(p2);
        fichaDetalleService.addFichaDetalle(f2);

        Concreta concreta1 = new Concreta(m,p);
        Concreta concreta2 = new Concreta(m,p2);

        m.getConcretaA().add(concreta1);
        m.getConcretaA().add(concreta2);

        misionService.update(m);


        System.out.println("Datos iniciales añadidos correctamente.");
    }
}
