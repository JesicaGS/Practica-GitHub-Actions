package mate;

public class Operacion {
    private double  num1;
    private double num2; 
    
    public Operacion (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double Sumar (double num1, double num2) {
        return num1 + num2;
    }

    public double Restar (double num1, double num2) {
        return num1 - num2;
    }

    public double Multiplicar (double num1, double num2) {
        return num1 * num2;
    }

    public double Dividir (double num1, double num2) {
        return num1 / num2;
    }
}
