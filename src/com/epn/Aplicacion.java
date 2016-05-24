package com.epn;

import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) throws IOException {
        LeerFichero nuevo = new LeerFichero();
        int d1;
        StringTokenizer tokens = new StringTokenizer(nuevo.leerGrafico(), "\n");
        String[] linea = new String[tokens.countTokens()];
        d1 = tokens.countTokens();
        for (int i = 0; i < d1; i++) {
            linea[i] = tokens.nextToken();
        }
        Sintaxis f = new Sintaxis();
        int j, d = 9;
        for (j = 0; j < linea.length; j++) {
            StringTokenizer token1s = new StringTokenizer(linea[j], " ");
            String[] h = new String[token1s.countTokens()];
            d1 = token1s.countTokens();
            for (int i = 0; i < d1; i++) {
                h[i] = token1s.nextToken();
            }
            JOptionPane.showMessageDialog(null, linea[j]);
            JOptionPane.showMessageDialog(null, h);
            if (f.comparar(h) == false) {
                JOptionPane.showMessageDialog(null, "Su codigo esta incorrecto");
                d = 8;
                break;
            } else {
                d = 0;
            }
        }
        if (d == 0) {
            JOptionPane.showMessageDialog(null, "Su codigo esta correcto");
        }
    }
}
