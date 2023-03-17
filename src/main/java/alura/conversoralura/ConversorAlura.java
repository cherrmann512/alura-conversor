package alura.conversoralura;

import alura.conversoralura.controller.*;
import alura.conversoralura.view.*;

/**
 *
 * @author cherr
 */
public class ConversorAlura {

    public static void main(String[] args) {  

    	MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        MenuController menuC = new MenuController(menu);

    }
}
