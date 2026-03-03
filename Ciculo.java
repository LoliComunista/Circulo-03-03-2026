package br.ulbra.atv9;

import javax.swing.JOptionPane;

public class Circulo {

    private double raio;

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcularPerimetro() {
        JOptionPane.showMessageDialog(null, "o restuldado do perimetro é " + (2 * 3.14 * raio));

    }

    public void calcularArea() {
        JOptionPane.showMessageDialog(null, "o resultado da area é " + (3.14 * raio * raio));
    }

    public void calcularDiametro() {
        JOptionPane.showMessageDialog(null, "o resultado do diametro é " + (2 * raio));
    }

    public String calcularP() {
        return "o restuldado do perimetro é " + (2 * 3.14 * raio);
    }

    public String calcularA() {
        return "o resultado da area é " + (3.14 * raio * raio);
    }

    public String calcularD() {
        return "o resultado do diametro é " + (2 * raio);

    }
}
