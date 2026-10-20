package main.java.edu.mejiasoft.calculadora.exception;

import main.java.edu.mejiasoft.calculadora.utils.exception.CalculadoraErrorCode;

public class CalculadoraException extends RuntimeException{
    
    private final CalculadoraErrorCode codigo;
    
    public CalculadoraException(CalculadoraErrorCode codigo){
    super(codigo.name());
    this.codigo = codigo;
    }
    
    public CalculadoraErrorCode getCodigo(){
    return codigo;
    }
}
