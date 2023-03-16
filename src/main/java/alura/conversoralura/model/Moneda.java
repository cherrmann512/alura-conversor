/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alura.conversoralura.model;

/**
 *
 * @author cherr
 */
public class Moneda {
    
    
    
    private final double ARS_TO_USD = 0.0050; //un peso equivale a 0.0050 dolares
    private final double ARS_TO_EUR = 0.0047; //un peso equivale a 0.0047 euros
    private final double ARS_TO_GBP = 0.0042; //un peso equivale a 0.0042 libras
    private final double ARS_TO_JPY = 0.68; //un peso equivale a 0.68 yenes
    private final double ARS_TO_KRW = 6.59; //un peso equivale a 6.59 won
    
    
    private double valor;
    private String divisa;
    
    public Moneda(double valor){
        this.valor = valor;
        this.divisa = "Pesos Argentinos";
    }
    
    public Moneda(double valor, String divisa){
        this.valor = valor;
        this.divisa = divisa;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
    
    public String getDivisa() {
		return divisa;
	}
    
    
    public double convertir(String conversion){
        switch (conversion) { 
            case "Peso Argentino a Dolar":
                return this.valor *ARS_TO_USD;
            case "Peso Argentino a Euro":
            	return this.valor *ARS_TO_EUR;
            case "Peso Argentino a Yen":
            	return this.valor *ARS_TO_JPY;
            case "Peso Argentino a Won":
            	return this.valor *ARS_TO_KRW;
            case "Peso Argentino a Libra":
            	return this.valor *ARS_TO_GBP;
            case "Dolar a Peso Argentino":
            	return this.valor/ARS_TO_USD;
            case "Euro a Peso Argentino":
            	return this.valor/ARS_TO_EUR;
            case "Libra a Peso Argentino":
            	return this.valor/ARS_TO_GBP;
            case "Yen a Peso Argentino":
            	return this.valor/ARS_TO_JPY;
            case "Won a Peso Argentino":
            	return this.valor/ARS_TO_KRW;
            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return valor +" "+ divisa;
    }

    
    
}
