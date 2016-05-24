package com.epn;

public class Sintaxis {

    String[] s1 = {"tipo_de_dato", "variable", ";"};
    String[] s2 = {"variable", "=", "expresión", ";"};
    String[] s3 = {"vector", "[", "expresión", "]", "=", "expresión", ";"};
    String[] s4 = {"if", "(", "expresión", ")", "then", "comando", ";"};

    public boolean comparar(String[] x) {
        switch (x.length) {
            case 3:
                return comaparar2(x, s1, 3);
            case 4:
                return comaparar2(x, s2, 4);
            case 7:
                if (x[0].compareTo(s3[0]) == 0) {
                    return comaparar2(x, s3, 7);
                } else {
                    return comaparar2(x, s4, 7);
                }
            default:
                return false;
        }
    }

    public boolean comaparar2(String[] x, String[] s, int f) {
        boolean v;
        int i = 0;
        do {
            if (x[i].compareTo(s[i]) == 0) {
                v = true;
            } else {//JOptionPane.showMessageDialog(null, "Error");
                v = false;
                i = f + 4;
            }
            i++;
        } while ((i + 1) <= f);
        return v;
    }
}
