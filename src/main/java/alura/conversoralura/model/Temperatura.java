/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alura.conversoralura.model;

/**
 *
 * @author cherr
 */
public class Temperatura {
    private double grados;
    private Escala escala;
    
    
    public Temperatura(double grados, Escala escala){
        this.grados = grados;
        this.escala = escala;
    }
    
    public Temperatura() {
    	this.grados = 0;
    	this.escala = Escala.CELSIUS;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public Escala getEscala() {
        return escala;
    }

    public double getGrados() {
        return grados;
    }
    
    public double convertirACelsius(){
        switch (this.escala) {
            case CELSIUS:
                return this.grados;
            case FAHRENHEIT:
                return (this.grados - 32.0) * 5.0 / 9.0;
            case KELVIN:
                return this.grados - 273.15;
                
            default:
                throw new AssertionError();
        }
    }
    
    public double convertirAFahrenheit(){
        switch (this.escala) {
            case FAHRENHEIT:
                return this.grados;
            case CELSIUS:
                return (this.grados * 9.0/5.0) + 32;
            case KELVIN:
                return (this.grados - 273.15) * 9.0 / 5.0 +32;
                
            default:
                throw new AssertionError();
        }
    }
    
    public double convertirAKelvin(){
        switch (this.escala) {
            case KELVIN:
                return this.grados;
            case CELSIUS:
                return this.grados + 273.15;
            case FAHRENHEIT:
                return ((this.grados - 32 ) * 5.0 / 9.0) +273.15;
                
            default:
                throw new AssertionError();
        }
    }
    
    public double conversion(String conversion) {
    	switch (conversion) {
		case "Celsius a Fahrenheit":
			return this.convertirAFahrenheit();
		case "Celsius a Kelvin":
			return this.convertirAKelvin();
		case "Fahrenheit a Celsius":
			return this.convertirACelsius();
		case "Fahrenheit a Kelvin":
			return this.convertirAKelvin();
		case "Kelvin a Celsius":
			return this.convertirACelsius();
		case "Kelvin a Fahrenheit":
			return this.convertirAFahrenheit();
		default:
			throw new AssertionError();
		}
    }

    @Override
    public String toString() {
        return "Temperatura: " + this.grados + "° en Escala " + this.escala; 
        }
        
        
    
}
