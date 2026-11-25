import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Precio del equipo: ");
        double precio = lector.nextDouble();
        System.out.print("Comprador estudiante acreditado (1 = si, 0 = no): ");
        int p = lector.nextInt();
        System.out.print("Equipo de catalogo educativo (1 = si, 0 = no): ");
        int q = lector.nextInt();

        if (precio < 0) {
            System.out.println("Error: el precio no puede ser negativo.");
        } else if ((p != 0 && p != 1) || (q != 0 && q != 1)) {
            System.out.println("Error: escribe solo 1 o 0.");
        } else {
            boolean esEstudiante = (p == 1);
            boolean esEducativo = (q == 1);
            int porcentaje;

            if (esEstudiante && esEducativo) {
                porcentaje = 0;
            } else if (esEstudiante ^ esEducativo) {
                porcentaje = 8;
            } else {
                porcentaje = 16;
            }

            double impuesto = precio * porcentaje / 100;
            double total = precio + impuesto;

            System.out.println("Impuesto aplicable: " + porcentaje + "%");
            System.out.println("Impuesto a pagar: " + impuesto);
            System.out.println("Total a pagar: " + total);
        }

        lector.close();
    }
}
