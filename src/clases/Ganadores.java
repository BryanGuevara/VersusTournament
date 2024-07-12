package clases;

import java.awt.Color;
import javax.swing.JTextField;

public class Ganadores {

    Color win = Color.BLUE;
    Color lose = Color.RED;
    Color blanco = Color.WHITE;
    Color negro = new Color(56, 56, 56);

    public String Calculos(JTextField[] Nombres, JTextField[] Puntos, JTextField[] Resultados, JTextField[] ResultadoPunto) {
        JTextField[] nombres = Nombres;
        JTextField[] puntos = Puntos;
        JTextField[] resultadosNombres = Resultados;
        JTextField[] puntosN = ResultadoPunto;
        int cantidad = resultadosNombres.length;
        String Error = "";

        try {

            for (int i = 0; i < cantidad; i++) {
                int puntoEquipo1 = Integer.parseInt(puntos[i * 2].getText());
                int puntoEquipo2 = Integer.parseInt(puntos[i * 2 + 1].getText());

                if (puntoEquipo1 < puntoEquipo2) {
                    resultadosNombres[i].setText(nombres[i * 2 + 1].getText());
                    nombres[i * 2].setBackground(lose);
                    nombres[i * 2 + 1].setBackground(win);
                } else if (puntoEquipo1 == puntoEquipo2 &&  !nombres[i * 2 + 1].getText().equals("(No hay)")) {
                    throw new IllegalStateException("Hay empate en: " + nombres[i * 2].getText() + " vs " + nombres[i * 2 + 1].getText());
                } else {
                    resultadosNombres[i].setText(nombres[i * 2].getText());
                    nombres[i * 2 + 1].setBackground(lose);
                    nombres[i * 2].setBackground(win);
                }
            }

            for (JTextField punto : puntos) {
                punto.setBackground(negro);
                punto.setForeground(blanco);
            }

            for (JTextField resultadoNombre : resultadosNombres) {
                resultadoNombre.setBackground(blanco);
            }

            for (JTextField point : puntosN) {
                point.setBackground(blanco);
                point.setEditable(true);
            }

            for (int i = 0; i < cantidad; i++) {
                puntos[i].setEditable(false);
            }

        } catch (NumberFormatException e) {
            Error = "Se encontraron caracteres no válidos.\n Error(" + e + ")";
            for (JTextField campo : resultadosNombres) {
                campo.setText("");
            }
        } catch (IllegalStateException e) {
            for (JTextField campo : resultadosNombres) {
                campo.setText("");
            }
            Error = "Error: " + e.getMessage();
        } catch (Exception e) {
            Error = "Se ha producido un error inesperado.\n Error(" + e + ")";
            for (JTextField campo : resultadosNombres) {
                campo.setText("");
            }
        }
        return Error;
    }
}
