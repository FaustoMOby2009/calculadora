package main.java.edu.mejiasoft.calculadora.controller;

import main.java.edu.mejiasoft.calculadora.exception.CalculadoraException;
import main.java.edu.mejiasoft.calculadora.service.CalculadoraService;
import main.java.edu.mejiasoft.calculadora.utils.scenemanager.SceneManager;

public class CalculadoraController {

    private CalculadoraService calculadoraService;
    private SceneManager stage;

    public CalculadoraController(CalculadoraService calculadoraService, SceneManager stage) {
        this.calculadoraService = calculadoraService;
        this.stage = stage;
    }

    public double handleSumar(double valor1, double valor2) {
        return calculadoraService.sumar(valor1, valor2);
    }
    
    public double handleRestar(double valor1, double valor2){
    return calculadoraService.resta(valor1, valor2);
    }
    
    public double handleMultiplicar(double valor1, double valor2){
    return calculadoraService.multiplicacion(valor1, valor2);
    }
    
    public double handleDivision(double valor1, double valor2)throws CalculadoraException{
    return calculadoraService.division(valor1, valor2);
    }
    
    public double handleElevado(double valor1){
    return calculadoraService.elevado(valor1);
    }
    
}
