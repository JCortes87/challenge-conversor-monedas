package com.aluracursos.conversor.clases;

import java.util.Scanner;

public class Conversor {

    public String conversorMoneda(int opcion) {

        String entrada;
        String salida;
        double valor;

        Scanner out = new Scanner(System.in);
        Scanner val = new Scanner(System.in);
        Selector selector = new Selector();
        ApiConversor apiConversor = new ApiConversor();

                entrada = selector.moneda(opcion);

            System.out.println("""
                    ********************************************************************
                    Sea bienvenido/a al Conversor de monedas de Alien Industries :)
                    
                    Seleccione una opción valida de CONVERSIÓN:
                    
                        1. Argentine Peso
                        2. Brazilian Real
                        3. Colombian Peso
                        4. Euro
                        5. Mexican Peso
                        6. United States Dollar
                        7. Salir
                    
                    ********************************************************************
                    """);

            opcion = out.nextInt();

            if (opcion > 0 && opcion < 7) {
                salida = selector.moneda(opcion);

                System.out.println("Por favor ingrese el valor que desea convertir");
                valor = val.nextDouble();

                Moneda moneda = apiConversor.buscarMonedas(entrada, salida, valor);

                return "El valor " + valor + "[" + moneda.base_code() + "] corresponde al valor final de =>>>>"
                        + moneda.conversion_result() + " [" + moneda.target_code() + "]";
            } else if (opcion == 7) {
                return "br%e@k";
            } else {
             return  "Opción no válida";
            }
    }

}
