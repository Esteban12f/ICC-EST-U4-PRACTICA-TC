import java.util.Scanner;


public class Extras {
    
    MetodosOrdBusq mOb = new MetodosOrdBusq();
    Scanner leer = new Scanner(System.in);
    boolean salir = false;

    public void opcionSelection(){
 
        while(!salir){
            System.out.println("**MENU**");
            System.out.println("1. Generar Arreglos aleatorios con diferente tamaño");
            System.out.println("2. Ordenar por los 3 metodos");
            System.out.println("3. Buscar valores busqueda binaria normal y busqueda binaria recursiva");
            System.out.println("0. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    mOb.mostrarArreglos();     
                    break;
            
                case 2:
                    mOb.mostrarTiempoOrdenamiento();
                    break;
    
                case 3:
                    System.out.println("Ingrese el valor a buscar: ");
                    mOb.realizarBusqueda(leer.nextInt());
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
}
