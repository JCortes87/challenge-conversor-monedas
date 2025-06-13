package com.aluracursos.conversor.clases;

public class Selector {

    public  String moneda (int valor) {

        String codigo;

        switch (valor) {
            case 1:
                codigo = "ARS";
                break;
            case 2:
                codigo = "BRL";
                break;
            case 3:
                codigo = "COP";
                break;
            case 4:
                codigo = "EUR";
                break;
            case 5:
                codigo = "MXN";
                break;
            case 6:
                codigo = "USD";
                break;
            default:
                codigo = "";
                break;
        }

        return  codigo;

    }

}
