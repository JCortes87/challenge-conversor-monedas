package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.clases.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 1;
        String resultado;

        Conversor conversor = new Conversor();
        Scanner op = new Scanner(System.in);

        while (opcion  > 0) {

            System.out.println("""
                        ********************************************************************
                        Sea bienvenido/a al Conversor de monedas de Alien Industries :)
                        
                        Seleccione una opción valida de ENTRADA:
                        
                        
                            1. Argentine Peso
                            2. Brazilian Real
                            3. Colombian Peso
                            4. Euro
                            5. Mexican Peso
                            6. United States Dollar
                            7. Salir
                        
                        ********************************************************************
                        """);

            opcion = op.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por utilizar nuestro conversor");
                break;
            } else if (opcion < 0 || opcion > 7) {
                System.out.println("Opción no válida");
                resultado = "br%e@k";
            } else {
                resultado = conversor.conversorMoneda(opcion);
            }

            if (resultado.equals("br%e@k")) {
                System.out.println("Gracias por utilizar nuestro conversor");
                break;
            } else {
                System.out.println(resultado);
            }
        }
    }
}
