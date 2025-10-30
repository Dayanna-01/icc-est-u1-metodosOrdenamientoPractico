public class SortBubble {

    public int[] ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, cambios = 0;
        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }

        System.out.println();
        System.out.println("Método Burbuja");
        System.out.print("Arreglo original -> ");
        mostrar(copia);

        for (int i = 0; i < copia.length - 1; i++) {
            boolean huboCambio = false;

            for (int j = 0; j < copia.length - 1 - i; j++) {
                comparaciones++;
                if ((ascendente && copia[j] > copia[j + 1]) || (!ascendente && copia[j] < copia[j + 1])) {
                    int aux = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = aux;
                    cambios++;
                    huboCambio = true;

                    if (mostrarPasos) {
                        System.out.println();
                        System.out.println("Intercambio: " + copia[j + 1] + " <-> " + copia[j]);
                        System.out.print("Estado actual -> ");
                        mostrar(copia);
                    }
                } else if (mostrarPasos) {
                    System.out.println("Comparando " + copia[j] + " y " + copia[j + 1] + " -> sin cambio");
                }
            }

            if (!huboCambio) break;
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
