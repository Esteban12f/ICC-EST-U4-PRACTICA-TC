
import java.util.Random;
import java.util.Arrays;


public class GenerarArreglosConsecutivos {

    Random rd = new Random();

    int [] arreglo = new int[10];
    int numero = (int)(Math.random() * 100);

    for (int i = 0; i < arreglo.length(); i++){
        arreglo[i] = numero;
    }
}



