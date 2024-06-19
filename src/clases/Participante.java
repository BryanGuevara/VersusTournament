package clases;

public class Participante {

    private int id;
    private String participante;

    public Participante(int ID, String Participante) {
        this.id = ID;
        this.participante = Participante;
    }

    public int getId() {
        return id;
    }

    public String getParticipante() {
        return participante;
    }
}
