import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Punto inicial P1");
        System.out.print(" x: ");
        double xInicial = lector.nextDouble();
        System.out.print(" y: ");
        double yInicial = lector.nextDouble();

        System.out.println("Punto final P2");
        System.out.print(" x: ");
        double xFinal = lector.nextDouble();
        System.out.print(" y: ");
        double yFinal = lector.nextDouble();

        double cambioX = xFinal - xInicial;
        double cambioY = yFinal - yInicial;

        double distancia = Math.sqrt(
            Math.pow(cambioX, 2) + Math.pow(cambioY, 2)
        );

        System.out.println("Cambio en x: " + cambioX);
        System.out.println("Cambio en y: " + cambioY);
        System.out.println("Distancia entre P1 y P2: " + distancia);

        lector.close();
    }
}