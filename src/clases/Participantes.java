package clases;

import java.util.ArrayList;

public class Participantes {
    private static ArrayList<Participante> participantes = new ArrayList<>();

    public static void añadirParticipante(Participante p) {
        participantes.add(p);
    }

    public static void eliminarParticipantePorId(int id) {
        participantes.removeIf(p -> p.getId() == id);
    }

    public static ArrayList<Participante> getParticipantes() {
        return participantes;
    }
}
