public class App {
    public static void main(String[] args) {
        View vista = new View();
        int[] numeros = {19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45};

        while (true) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion(4);

            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break;
            }

            boolean pasos = vista.leerPasos();
            boolean ascendente = vista.leerOrden();

            if (opcion == 1) {
                SortSelection s = new SortSelection();
                s.ordenar(numeros, ascendente, pasos);
            } else if (opcion == 2) {
                SortInsertion s = new SortInsertion();
                s.ordenar(numeros, ascendente, pasos);
            } else if (opcion == 3) {
                SortBubble s = new SortBubble();
                s.ordenar(numeros, ascendente, pasos);
            }
        }
    }
}
