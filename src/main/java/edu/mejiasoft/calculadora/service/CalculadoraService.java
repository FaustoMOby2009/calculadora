package main.java.edu.mejiasoft.calculadora.service;

import main.java.edu.mejiasoft.calculadora.exception.CalculadoraException;
import main.java.edu.mejiasoft.calculadora.utils.exception.CalculadoraErrorCode;

public class CalculadoraService {

    public double resultado;

    public CalculadoraService() {
    }

    public double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double division(double valor1, double valor2) throws CalculadoraException {
        if (valor2 == 0) {
            throw new CalculadoraException(CalculadoraErrorCode.ERROR_ARITMETRICA_DIVISION);
        }
        return valor1 / valor2;
    }

    public double elevado(double valor1) {
        return valor1 * valor1;
    }
}
