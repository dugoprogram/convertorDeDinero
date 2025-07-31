import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;

public class Principal {
    public static String[] obtenerNombresMoneda(int opcion) {
        return switch (opcion) {
            case 1 -> new String[]{"Peso chileno", "Dólar"};
            case 2 -> new String[]{"Dólar", "Peso chileno"};
            case 3 -> new String[]{"Real", "Dólar"};
            case 4 -> new String[]{"Dólar", "Real"};
            case 5 -> new String[]{"Dólar australiano", "Dólar"};
            case 6 -> new String[]{"Dólar", "Dólar australiano"};
            case 7 -> new String[]{"Peso mexicano", "Dólar"};
            case 8 -> new String[]{"Dólar", "Peso mexicano"};
            case 9 -> new String[]{"Yen", "Dólar"};
            case 10 -> new String[]{"Dólar", "Yen"};
            case 11 -> new String[]{"Boliviano", "Dólar"};
            case 12 -> new String[]{"Dólar", "Boliviano"};
            case 13 -> new String[]{"Yuan", "Dólar"};
            case 14 -> new String[]{"Dólar", "Yuan"};
            case 15 -> new String[]{"Peso argentino", "Dólar"};
            case 16 -> new String[]{"Dólar", "Peso argentino"};
            default -> new String[]{"Moneda desconocida", "Moneda desconocida"};
        };
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        LinkedList<String> historial = new LinkedList<>();

        while (true) {
            System.out.println("Hola, seleccione una opción:");
            System.out.println("1- Convertir de peso chileno a dólar");
            System.out.println("2- Convertir de dólar a peso chileno");
            System.out.println("3- Convertir de real a dólar");
            System.out.println("4- Convertir de dólar a real");
            System.out.println("5- Convertir de dólar australiano a dólar");
            System.out.println("6- Convertir de dólar a dólar australiano");
            System.out.println("7- Convertir de peso mexicano a dólar");
            System.out.println("8- Convertir de dólar a peso mexicano");
            System.out.println("9- Convertir de yen a dólar");
            System.out.println("10- Convertir de dólar a yen");
            System.out.println("11- Convertir de boliviano a dólar");
            System.out.println("12- Convertir de dólar a boliviano");
            System.out.println("13- Convertir de yuan a dólar");
            System.out.println("14- Convertir de dólar a yuan");
            System.out.println("15- Convertir de peso argentino a dólar");
            System.out.println("16- Convertir de dólar a peso argentino");
            System.out.println("17- Salir");

            try {
                int opcion = Integer.parseInt(lectura.nextLine());

                if (opcion < 1 || opcion > 17) {
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
                    continue;
                }

                if (opcion == 17) {
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    break;
                }

                System.out.println("Introduzca la cantidad deseada a convertir:");
                double cantidad = Double.parseDouble(lectura.nextLine());

                // Llama al servicio de consulta de moneda
                Moneda moneda = consulta.buscaMoneda();

                // Aquí llamaremos a la clase de conversión (paso 3)
                double resultado = ConversorApp.convertir(opcion, cantidad, moneda);

                String[] nombres = obtenerNombresMoneda(opcion);
                System.out.printf("%.2f %s equivalen a %.2f %s%n", cantidad, nombres[0], resultado, nombres[1]);
                String registro = String.format("%.2f %s → %.2f %s", cantidad, nombres[0], resultado, nombres[1]);
                historial.addFirst(registro);
                if (historial.size() > 5) {
                    historial.removeLast();
                }
                System.out.println("\nHistorial de conversiones (últimas 5):");
                for (String h : historial) {
                    System.out.println("- " + h);
                }
                System.out.println();


                // Guarda la conversión en un archivo
                //GeneradorDeArchivo generador = new GeneradorDeArchivo();
                //generador.guardarJson(moneda);

            } catch (NumberFormatException e) {
                System.out.println("Número de opción o cantidad no válida. Inténtelo nuevamente.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
                break;
            }
        }
    }
}