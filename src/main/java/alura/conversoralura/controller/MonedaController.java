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
        	try {
	            double monto = (Double.parseDouble(view.txtMonto.getText()));

	        	switch(view.cmbConversiones.getSelectedIndex()) {
		        	case 0:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(moneda,"Dolares",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 1:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(moneda,"Euros",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 2:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(moneda,"Libras",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 3:
		        		moneda = new Moneda(monto);
		        		conversion(moneda,"Won Surcoreanos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 4:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto);
		        		conversion(moneda,"Yenes",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 5:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto, "Dolares");
		        		conversion(moneda,"Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 6:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Euros");
		        		conversion(moneda,"Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 7:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Libras");
		        		conversion(moneda,"Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 8:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Won Surcoreanos");
		        		conversion(moneda,"Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
		        		break;
		        	case 9:
		        		System.out.println(view.cmbConversiones.getSelectedItem().toString());
		        		moneda = new Moneda(monto,"Yenes");
		        		conversion(moneda,"Pesos Argentinos",view.cmbConversiones.getSelectedItem().toString());
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
    
    public void conversion(Moneda mon, String divisaDestino, String conversion) {
    	double nuevoMonto = Math.round(moneda.convertir(conversion)*100.0)/100.0;
    	mon.setValor(nuevoMonto);
    	mon.setDivisa(divisaDestino);
    	System.out.println(mon.toString());
    	JOptionPane.showMessageDialog(null, "Tienes $ "+mon.toString());
    }
}
