import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //JUAN CAMILO GARZON CAPADOR


        System.out.println("2 Parcial");
        Linea lin = new Linea();
        Scanner teclado = new Scanner(System.in);

        boolean salir = false;

        while (!salir){
            System.out.println("1. Registrar llamada");
            System.out.println("2. Información de llamada");
            System.out.println("3. Consolidado Total");
            System.out.println("4. Reiniciar lineas");
            System.out.print("Digite opción: ");
            int opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Datos de la llamada");
                    System.out.println("1. Llamada local");
                    System.out.println("2. Llamada distancia");
                    System.out.println("3. Llamada celular");
                    System.out.print("Digite opcion: ");
                    int opcion = teclado.nextInt();
                    if (opcion == 1){
                        int durllamadas, contllamadas=0;
                        contllamadas += 1;
                        System.out.print("Duracion llamada (min): ");
                        durllamadas = teclado.nextInt();

                        lin.setLlamadas(contllamadas);
                        lin.setDuracionLlamada(durllamadas);
                        lin.setTipoLlamada(1);
                    }
                    break;
                case 2:
                    System.out.println(lin.toString());
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Adios");
            }
        }
    }
}