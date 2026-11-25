import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos ingresados desde la consola
        Scanner lector = new Scanner(System.in);

        // Solicitamos los datos de entrada (ajusta estos textos segun el enunciado del problema 2)
        System.out.print("Ingresa el primer valor: ");
        double valor1 = lector.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        double valor2 = lector.nextDouble();

        // Calculamos el resultado (ajusta la formula o logica segun lo que pida el problema 2)
        double resultado = valor1 + valor2;

        // Mostramos el resultado final en pantalla
        System.out.println("Resultado: " + resultado);

        lector.close();
    }
}