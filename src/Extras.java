import java.util.Scanner;


public class Extras {
    
    MetodosOrdBusq mOb = new MetodosOrdBusq();
    Scanner leer = new Scanner(System.in);
    boolean salir = false;

    public void opcionSelection(){
        boolean caso1 = false;
        boolean caso2 = false;
        while(!salir){
            System.out.println("**MENU**");
            System.out.println("1. Generar Arreglos aleatorios con diferente tamaño");
            System.out.println("2. Ordenar por los 3 metodos");
            System.out.println("3. Buscar valores busqueda binaria normal y busqueda binaria recursiva");
            System.out.println("0. Salir");
            int opcion = validacion(leer, "Escoja una opcion: ", false);

            switch (opcion) {
                case 1:
                    mOb.mostrarArreglos();    
                    caso1 = true; 
                    break;
            
                case 2:
                    if(caso1){
                        mOb.mostrarTiempoOrdenamiento();
                        caso2 = true;
                    } else {
                        System.out.println("Nose puede ordenar arreglos q no existen, generar primero :/");
                    }
                    
                    break;
    
                case 3:
                    if(caso2){
                        mOb.realizarBusqueda(validacion(leer, "Ingrese el valor a bucar: ", true));
                    } else {
                        System.out.println("No se puede utilizar el metodo de busqueda en arreglos no ordenados :/");
                    }
                    
                    break;
                
                case 0:
                    salir = true;
                    System.out.println("Programa terminado :)");
                    break;

                default:
                    System.out.println("Opcion incorrecta :/");
                    break;
            }
        }
        
    }

    public static int validacion(Scanner leer, String mensaje, boolean permitirNegativos){
            
        int arrayLength = 0;

        do{
            System.out.print(mensaje);
            while (!leer.hasNextInt()) {
                System.out.println("Debes ingresar un entero  positivo valido :/");
                System.out.print(mensaje);
                leer.next();
            }
            arrayLength = leer.nextInt();
            if (!permitirNegativos && arrayLength < 0){
                System.out.println("Opcion incorrecta :/");
            }
        } while(! permitirNegativos && arrayLength < 0);
        return arrayLength;
    
    }

}
