package alura.conversoralura;

import alura.conversoralura.model.Escala;
import alura.conversoralura.controller.MenuController;
import alura.conversoralura.model.*;
import alura.conversoralura.view.*;

/**
 *
 * @author cherr
 */
public class ConversorAlura {

    public static void main(String[] args) {  
//        Temperatura t = new Temperatura(280,Escala.KELVIN);
//        System.out.println(t.toString());
//        System.out.println(t.convertirACelsius());
//        System.out.println(t.convertirAFahrenheit());
//        System.out.println(t.convertirAKelvin());
//        Moneda m = new Moneda(100);
//        System.out.println(m.convertirADolares());
//        System.out.println(m.convertirAEuros());
//        System.out.println(m.convertirALibra());
//        System.out.println(m.convertirAWon());
//        
        
    	MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        MenuController menuC = new MenuController(menu);

    }
}
