import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View() {
        System.out.println("=== ALGORITMOS DE ORDENAMIENTO ===");
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\nSeleccione el método de ordenamiento:");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja Mejorado");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public int leerOpcion(int maximo) {
        int opcion = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= maximo) {
                    break;
                }
            } else {
                scanner.next(); // limpiar entrada
            }
            System.out.print("Opción inválida. Intente de nuevo: ");
        }
        return opcion;
    }

    public boolean leerPasos() {
        System.out.print("¿Desea ver los pasos? (true/false): ");
        while (true) {
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                scanner.next();
                System.out.print("Entrada inválida. Escriba true o false: ");
            }
        }
    }

    public boolean leerOrden() {
        System.out.print("¿Desea ordenar Ascendente (A) o Descendente (D)?: ");
        while (true) {
            String entrada = scanner.next().trim().toUpperCase();
            if (entrada.equals("A")) {
                return true;
            } else if (entrada.equals("D")) {
                return false;
            } else {
                System.out.print("Entrada inválida. Ingrese A o D: ");
            }
        }
    }
}
