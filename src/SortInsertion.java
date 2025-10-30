public class SortInsertion {

    public int[] ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, cambios = 0;
        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }

        System.out.println();
        System.out.println("Método Inserción");
        System.out.print("Arreglo original -> ");
        mostrar(copia);

        for (int i = 1; i < copia.length; i++) {
            int valor = copia[i];
            int j = i - 1;

            while (j >= 0 && ((ascendente && copia[j] > valor) || (!ascendente && copia[j] < valor))) {
                comparaciones++;
                copia[j + 1] = copia[j];
                j--;
                cambios++;

                if (mostrarPasos) {
                    System.out.println();
                    System.out.print("Moviendo " + copia[j + 1] + " -> ");
                    mostrar(copia);
                }
            }

            copia[j + 1] = valor;

            if (mostrarPasos) {
                System.out.print("Insertando " + valor + " en posición " + (j + 1) + " -> ");
                mostrar(copia);
            }
        }

        System.out.println();
        System.out.println("--FIN DEL MÉTODO--");
        System.out.print("Arreglo ordenado -> ");
        mostrar(copia);
        System.out.println("Comparaciones totales -> " + comparaciones);
        System.out.println("Cambios totales -> " + cambios);

        return new int[]{comparaciones, cambios};
    }

    private void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
