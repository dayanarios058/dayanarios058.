import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = new int[12]; // Creamos un arreglo con 3 espacios

        System.out.println("Por favor, ingresa tres números para llenar el arreglo:");

        // Pedimos al usuario que ingrese tres números para llenar el arreglo
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            arreglo[i] = scanner.nextInt(); // Leemos el número ingresado por el usuario y lo asignamos al arreglo
        }

        System.out.println("El arreglo llenado es:");
        // Imprimimos el arreglo llenado por el usuario
        for (int i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }

        scanner.close(); // Cerramos el objeto Scanner para liberar recursos.
    }
}
