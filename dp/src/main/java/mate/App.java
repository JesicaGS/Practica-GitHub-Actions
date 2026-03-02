package mate;

public class App {
    public static void main(String[] args) {
        Operacion op1 = new Operacion(13.5, 5);
        System.out.println("Suma: " + op1.Sumar(13.5, 5));
        System.out.println("Resta: " + op1.Restar(13.5, 5));
        System.out.println("Multiplicación: " + op1.Multiplicar(13.5, 5));
        System.out.println("División: " + op1.Dividir(13.5, 5));
    }
}