package Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        double cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/6095e66f549e686a5f419354/latest/USD"))
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new GsonBuilder().create();

        Datos datos = gson.fromJson(json, Datos.class);
        Conversiones operacion = new Conversiones(datos);
        System.out.println("\nBienvenido al sistema de conversion de moneda");
        System.out.println("***************************************");
        boolean cerrar = true;

        while(cerrar){
            try {
                System.out.println("\nSelecciona una opcion para continuar:\n");
                System.out.println("1) Dolar a Peso Argentino");
                System.out.println("2) Peso Argentino a dolar");
                System.out.println("3) Dolar a Peso Mexicano");
                System.out.println("4) Peso Mexicano a dolar");
                System.out.println("5) Dolar a Sol Peruano");
                System.out.println("6) Sol Peruano a Dolar");
                System.out.println("7) Dolar a Yen Japones");
                System.out.println("8) Yen Japones a Dolar");
                System.out.println("9) Salir");

                int opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f USD equivale a %.2f ARS"
                                ,cantidad,operacion.usdars(cantidad));
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f ARS equivale a %.3f USD"
                                ,cantidad,operacion.arsusd(cantidad));
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f USD equivale a %.2f MXN"
                                ,cantidad,operacion.usdmxn(cantidad));
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f MXN equivale a %.2f USD"
                                ,cantidad,operacion.mxnusd(cantidad));
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f USD equivale a %.2f PEN"
                                ,cantidad,operacion.usdpen(cantidad));
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f PEN equivale a %.2f USD"
                                ,cantidad,operacion.penusd(cantidad));
                        break;
                    case 7:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f USD equivale a %.2f JPYD"
                                ,cantidad,operacion.usdjpy(cantidad));
                        break;
                    case 8:
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad=sc.nextDouble();
                        System.out.printf("El valor de %.2f JPY equivale a %.2f USD"
                                ,cantidad,operacion.jpyusd(cantidad));
                        break;
                    case 9:
                        System.out.println("\nGracias por utilizar nuestro servicio!");
                        cerrar = false;
                        break;
                    default:
                        System.out.println("\tOpcion invalida, por favor introduce un numero" +
                                " de opcion correcta!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Por favor ingresa un numero, no letras ni caracteres");
                sc.next();
            }
        }
        System.out.println("Terminando la ejecucion...");
    }
}
