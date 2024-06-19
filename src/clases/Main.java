package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Participante> participantes = new ArrayList<>();

        System.out.println("Ingrese el número de participantes:");
        int numParticipantes = scanner.nextInt();
        scanner.nextLine();

        int id = 1;

        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("Ingrese el nombre del participante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            participantes.add(new Participante(id, nombre));
            id++;
        }

        scanner.close();

        Participante[] participanteArray = new Participante[participantes.size()];
        participantes.toArray(participanteArray);

        for (Participante p : participanteArray) {
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getParticipante());
        }
    }
}
