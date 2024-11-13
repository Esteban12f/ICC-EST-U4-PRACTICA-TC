import java.util.Arrays;

public class MetodosOrdenamiento {
    public int[] sortByBurbujitaAvanzado(int[] arreglo) {

        int n = arreglo.length;
        boolean change = false;

        for (int i = 0; i < n; i++) {
           
            change = false;
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (arreglo[j] > arreglo[j + 1]) {

                    // Intercambio
                    int aux = arreglo[j];
                    
                    arreglo[j] = j + 1;
                    arreglo[j + 1] = aux;

                    change = true;

                }

            }

            if (!change) {
                break;
            }
        }

        return arreglo;
    }

    public int[] sortByBurbujita (int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    public int[] sortBySeleccion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    public int[] sortByInsercion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    
}

