/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alura.conversoralura.controller;

import alura.conversoralura.model.*;
import alura.conversoralura.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


/**
 *
 * @author cherr
 */
public class MonedaController implements ActionListener{
    
    private Moneda moneda;
    private MonedasView view;
    
    public MonedaController(Moneda moneda, MonedasView view){
        this.moneda = moneda;
        this.view = view;
        this.view.btnConvertir.addActionListener(this);
        this.view.btnAtras.addActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== view.btnConvertir) {
        	//implementar btnConvertir
        	try {
	            double monto = (Double.parseDouble(view.txtMonto.getText()));
	        	//System.out.println(monto);
	        	switch(view.cmbConversiones.getSelectedIndex()) {
		        	case 0:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(monto,"Pesos Argentinos","Dolares",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 1:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(monto,"Pesos Argentinos","Euros",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 2:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(monto,"Pesos Argentinos","Libras",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 3:
		        		moneda = new Moneda(monto);
		        		conversion(monto,"Pesos Argentinos","Won Surcoreanos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 4:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(monto,"Pesos Argentinos","Yenes",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 5:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto, "Dolares");
		        		conversion(monto,"Dolares","Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 6:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Euros");
		        		conversion(monto,"Euros","Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 7:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Libras");
		        		conversion(monto,"Libras","Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 8:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Won Surcoreanos");
		        		conversion(monto,"Won Surcoreanos","Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 9:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Yenes");
		        		conversion(monto,"Yenes","Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
	        	}
        	
        	}
        	catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Solo puede ingresar números");
			}
        	
        }
        if(e.getSource() == view.btnAtras) {
        	MenuView mv = new MenuView();
        	mv.setVisible(true);
        	mv.setLocationRelativeTo(null);
        	this.view.dispose();
        	MenuController mc = new MenuController(mv);
        	}
    }
    
    public void conversion(double monto, String divisaOrigen, String divisaDestino, String conversion) {
    	Moneda mon = new Moneda(monto,divisaOrigen);
    	double nuevoMonto = Math.round(moneda.convertir(conversion)*100.0)/100.0;
    	mon.setValor(nuevoMonto);
    	mon.setDivisa(divisaDestino);
    	System.out.println(mon.toString());
    	JOptionPane.showMessageDialog(null, "Tienes $ "+mon.toString());
    }
}
