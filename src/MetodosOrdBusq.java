import java.util.Arrays;

public class MetodosOrdBusq {
    
        int[] primeArray = generarArreglo(30000);
        int[] tamaño10 = Arrays.copyOf(primeArray, 10);
        int[] tamaño100 = Arrays.copyOf(primeArray, 100);
        int[] tamaño1000 = Arrays.copyOf(primeArray, 1000);
        int[] tamaño5000 = Arrays.copyOf(primeArray, 5000);
        int[] tamaño10000 = Arrays.copyOf(primeArray, 10000);
    
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

    public int searchBinary(int[] arreglo, int valorBuscar) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int mid = inicio + (fin - inicio) / 2;
            if (arreglo[mid] == valorBuscar) {
                return mid;
            }
            if (arreglo[mid] < valorBuscar) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1;
    }

    public int searchBinaryRec(int[] arreglo, int valorBuscar, int inicio, int fin){
        if(inicio > fin) return -1;
        int mid = (inicio + fin) / 2;
        if(arreglo[mid] == valorBuscar) return mid;
        if(valorBuscar < arreglo[mid]) return searchBinaryRec(arreglo, valorBuscar,inicio,mid -1);
        else return searchBinaryRec(arreglo, valorBuscar, mid + 1, fin);  
    }


    public int[] generarArreglo(int tamaño){
        int[] arreglo = new int[tamaño];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 30000) + 1;
        }
        return arreglo;
    }

    public void mostrarArreglos(){
        System.out.println("Arreglo de tamaño 10: " + Arrays.toString(tamaño10));
        System.out.println("Arreglo de tamaño 100: " + Arrays.toString(tamaño100));
        System.out.println("Arreglo de tamaño 100: " + Arrays.toString(tamaño1000));
        System.out.println("Arreglo de tamaño 100: " + Arrays.toString(tamaño5000));
        System.out.println("Arreglo de tamaño 100: " + Arrays.toString(tamaño10000));
        System.out.println("Arreglo de tamaño 100: " + Arrays.toString(primeArray));


    }

    public void mostrarTiempoOrdenamiento() {

        System.out.println("Tiempos de ejecucion con el metodo de Ordenamiento de Burbuja: ");
        calcularTiempo(sortByBurbujita(tamaño10), "tamaño 10");
        calcularTiempo(sortByBurbujita(tamaño100), "tamaño 100");
        calcularTiempo(sortByBurbujita(tamaño1000), "tamaño 1000");
        calcularTiempo(sortByBurbujita(tamaño5000), "tamaño 5000");
        calcularTiempo(sortByBurbujita(tamaño10000), "tamaño 10000");
        calcularTiempo(sortByBurbujita(primeArray), "tamaño 30000");
        
        System.out.println("");
        System.out.println("Tiempos de ejecucion con el metodo de Ordenamiento de Burbuja Avanzado: ");
        calcularTiempo(sortByBurbujitaAvanzado(tamaño10), "tamaño 10");
        calcularTiempo(sortByBurbujitaAvanzado(tamaño100), "tamaño 100");
        calcularTiempo(sortByBurbujitaAvanzado(tamaño1000), "tamaño 1000");
        calcularTiempo(sortByBurbujitaAvanzado(tamaño5000), "tamaño 5000");
        calcularTiempo(sortByBurbujitaAvanzado(tamaño10000), "tamaño 10000");
        calcularTiempo(sortByBurbujitaAvanzado(primeArray), "tamaño 30000");

        System.out.println("");
        System.out.println("Tiempos de ejecucion con el metodo de Ordenamiento de Insercion: ");
        calcularTiempo(sortByInsercion(tamaño10), "tamaño 10");
        calcularTiempo(sortByInsercion(tamaño100), "tamaño 100");
        calcularTiempo(sortByInsercion(tamaño1000), "tamaño 1000");
        calcularTiempo(sortByInsercion(tamaño5000), "tamaño 5000");
        calcularTiempo(sortByInsercion(tamaño10000), "tamaño 10000");
        calcularTiempo(sortByInsercion(primeArray), "tamaño 30000");

        System.out.println("");
        System.out.println("Tiempos de ejecucion con el metodo de Ordenamiento de Seleccion: ");
        calcularTiempo(sortBySeleccion(tamaño10), "tamaño 10");
        calcularTiempo(sortBySeleccion(tamaño100), "tamaño 100");
        calcularTiempo(sortBySeleccion(tamaño1000), "tamaño 1000");
        calcularTiempo(sortBySeleccion(tamaño5000), "tamaño 5000");
        calcularTiempo(sortBySeleccion(tamaño10000), "tamaño 10000");
        calcularTiempo(sortBySeleccion(primeArray), "tamaño 30000");

        
    }


    public void calcularTiempo(int[] arreglo, String tamañoString){
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        double duracion = (fin - inicio) / 1_000_000_000.0;
        System.out.println("Tiempo total de ejecucion en el arreglo de " + tamañoString + " es: " + duracion + " en segundos"); 
    }

    public void calcularTiempo(int valorBuscar, String tamañoString, String valor){
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        double duracion = (fin - inicio) / 1_000_000_000.0;
        if(Integer.parseInt(valor) == -1){
            System.out.println("Tiempo total de ejecucion en el arreglo de " + tamañoString + " es: " + duracion + " en segundos y el valor no se encuentra en arreglo"); 
        } else {
            System.out.println("Tiempo total de ejecucion en el arreglo de " + tamañoString + " es: " + duracion + " en segundos y el valor se encuentra en la posicion " + valor); 
        }
    }
    
    public void realizarBusqueda(int valorBuscar){
        System.out.println("Tiempos de ejecucion mediante la busqueda Binaria");
        calcularTiempo(searchBinary(tamaño10, valorBuscar), "tamaño 10",
        Integer.toString(searchBinary(tamaño10, valorBuscar)));
        calcularTiempo(searchBinary(tamaño100, valorBuscar), "tamaño 100",
        Integer.toString(searchBinary(tamaño100, valorBuscar)));
        calcularTiempo(searchBinary(tamaño1000, valorBuscar), "tamaño 1000",
        Integer.toString(searchBinary(tamaño1000, valorBuscar)));
        calcularTiempo(searchBinary(tamaño5000, valorBuscar), "tamaño 5000",
        Integer.toString(searchBinary(tamaño5000, valorBuscar)));
        calcularTiempo(searchBinary(tamaño10000, valorBuscar), "tamaño 10000",
        Integer.toString(searchBinary(tamaño10000, valorBuscar)));
        calcularTiempo(searchBinary(primeArray, valorBuscar), "tamaño 30000",
        Integer.toString(searchBinary(primeArray, valorBuscar)));
        System.out.println("");

        
        System.out.println("Tiempos de ejecucion mediante la busqueda Binaria Recursiva");
        calcularTiempo(searchBinaryRec(tamaño10, valorBuscar, 0, 9), "tamaño 10",
        Integer.toString(searchBinaryRec(tamaño10, valorBuscar,0 ,9)));
        calcularTiempo(searchBinaryRec(tamaño100, valorBuscar, 0, 99), "tamaño 100",
        Integer.toString(searchBinaryRec(tamaño100, valorBuscar, 0, 99)));
        calcularTiempo(searchBinaryRec(tamaño1000, valorBuscar, 0, 999), "tamaño 1000",
        Integer.toString(searchBinaryRec(tamaño1000, valorBuscar, 0, 999)));
        calcularTiempo(searchBinaryRec(tamaño5000, valorBuscar, 0 , 4999), "tamaño 5000",
        Integer.toString(searchBinaryRec(tamaño5000, valorBuscar, 0, 4999)));
        calcularTiempo(searchBinaryRec(tamaño10000, valorBuscar,0 , 9999), "tamaño 10000",
        Integer.toString(searchBinaryRec(tamaño10000, valorBuscar, 0, 9999)));
        calcularTiempo(searchBinaryRec(primeArray, valorBuscar, 0, 29999), "tamaño 30000",
        Integer.toString(searchBinaryRec(primeArray, valorBuscar, 0, 29999)));


    }

}

