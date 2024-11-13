public class MetodosBusqueda {
    
    public int searchBinary(int[] arreglo, int valorBuscar) {
        int left = 0;
        int right = arreglo.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arreglo[mid] == valorBuscar) {
                return mid;
            }
            if (arreglo[mid] < valorBuscar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
