public class SortSelection {

    public int[] ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }

        System.out.println();
        System.out.println("Método Selección");
        System.out.print("Arreglo original -> ");
        mostrar(copia);

        for (int i = 0; i < copia.length - 1; i++) {
            int indiceMin = i;

            for (int j = i + 1; j < copia.length; j++) {
                comparaciones++;
                if ((ascendente && copia[j] < copia[indiceMin]) || (!ascendente && copia[j] > copia[indiceMin])) {
                    indiceMin = j;
                }

                if (mostrarPasos) {
                    System.out.println();
                    System.out.println("Comparando posición " + j + " con índice " + i);
                }
            }

            if (indiceMin != i) {
                int aux = copia[i];
                copia[i] = copia[indiceMin];
                copia[indiceMin] = aux;
                cambios++;

                if (mostrarPasos) {
                    System.out.println("Intercambio: " + copia[indiceMin] + " <-> " + copia[i]);
                    System.out.print("Estado actual -> ");
                    mostrar(copia);
                }
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
